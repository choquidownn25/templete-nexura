package org.example.adapters;

import org.example.entity.Category;
import org.example.entity.Purchase;
import org.example.mappers.CategoryMapper;
import org.example.mappers.PurchaseMapper;
import org.example.repository.PurchaseRepository;
import org.exemple.data.CategoryDto;
import org.exemple.data.PurchaseDto;
import org.exemple.ports.spi.PurchasePersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseJpaAdapter implements PurchasePersistencePort {

    //@Autowired
    private PurchaseRepository purchaseRepository;

    //@Autowired
    private PurchaseMapper purchaseMapper;
    @Override
    public PurchaseDto addPurchase(PurchaseDto purchaseDto) {
        Purchase purchase = purchaseMapper.purchaseToPurchaseDto(purchaseDto);
        PurchaseDto purchaseDtos = purchaseMapper.purchaseDtoToPurchase(purchaseRepository.save(purchase)) ;
        return purchaseDtos;

    }

    @Override
    public PurchaseDto updatePurchase(PurchaseDto purchaseDto) {
        Purchase purchase = purchaseMapper.purchaseToPurchaseDto(purchaseDto);
        PurchaseDto purchaseDtos = purchaseMapper.purchaseDtoToPurchase(purchaseRepository.save(purchase)) ;
        return purchaseDtos;
    }

    @Override
    public void deletePurchase(Integer id) {
        purchaseRepository.deleteById(id);
    }

    @Override
    public List<PurchaseDto> getPurchases() {
        List<Purchase> listPurchases = purchaseRepository.findAll();
        return PurchaseMapper.INSTANCE.purchaseDtoListToPurchaseList(listPurchases);
    }

    @Override
    public PurchaseDto getPurchaseById(Integer id) {
        //Encuentra un registro
        Optional<Purchase> purchaseId = purchaseRepository.findById(id);
        if (purchaseId.isPresent()) {
            return PurchaseMapper.INSTANCE.purchaseDtoToPurchase(purchaseId.get());
        }
        return null;
    }
}
