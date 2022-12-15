package org.example.adapters;

import org.example.entity.Category;
import org.example.entity.Sale;
import org.example.mappers.CategoryMapper;
import org.example.mappers.SaleMapper;
import org.example.repository.SaleRepository;
import org.exemple.data.CategoryDto;
import org.exemple.data.SaleDto;
import org.exemple.ports.spi.SalePersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleJpaAdapter implements SalePersistencePort {
    //@Autowired
    private SaleRepository saleRepository;
    //@Autowired
    private SaleMapper saleMapper;

    @Override
    public SaleDto addSale(SaleDto saleDto) {
        Sale sale = saleMapper.saleToSaleDto(saleDto);
        SaleDto saleDtos = saleMapper.saleDtoToSale(saleRepository.save(sale)) ;
        return saleDtos;
    }

    @Override
    public SaleDto updateSale(SaleDto saleDto) {
        Sale sale = saleMapper.saleToSaleDto(saleDto);
        SaleDto saleDtos = saleMapper.saleDtoToSale(saleRepository.save(sale)) ;
        return saleDtos;
    }

    @Override
    public void deleteSale(Integer id) {
        saleRepository.deleteById(id);
    }

    @Override
    public List<SaleDto> getSaleDtos() {
        //Lista todos los registros
        List<Sale> listProducts = saleRepository.findAll();
        return SaleMapper.INSTANCE.saleDtoListToSaleList(listProducts);

    }

    @Override
    public SaleDto getSaleDtoById(Integer id) {
        //Encuentra un registro
        Optional<Sale> SaleId = saleRepository.findById(id);
        if (SaleId.isPresent()) {
            return SaleMapper.INSTANCE.saleDtoToSale(SaleId.get());
        }
        return null;
    }
}
