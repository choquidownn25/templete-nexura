package org.example.adapters;

import org.example.entity.Category;
import org.example.entity.Supplier;
import org.example.mappers.CategoryMapper;
import org.example.mappers.SupplierMapper;
import org.example.repository.SaleRepository;
import org.example.repository.SupplierRepository;
import org.exemple.data.CategoryDto;
import org.exemple.data.ProductoDto;
import org.exemple.data.SupplierDto;
import org.exemple.ports.spi.SupplierPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierJpaAdapter implements SupplierPersistencePort {

    private SupplierRepository supplierRepository;
    private SupplierMapper supplierMapper;
    /*
    @Autowired
    public SupplierJpaAdapter(SupplierRepository supplierRepository,
                              SupplierMapper supplierMapper) {
        this.supplierRepository = supplierRepository;
        this.supplierMapper = supplierMapper;
    }*/
    @Override
    public SupplierDto addSupplierDto(SupplierDto supplierDto) {
        Supplier category = supplierMapper.supplierToSupplierDto(supplierDto);
        SupplierDto supplierDtos = supplierMapper.supplierDtoToSupplier(supplierRepository.save(category)) ;
        return supplierDtos;
    }

    @Override
    public SupplierDto updatSupplierDto(SupplierDto supplierDto) {
        Supplier category = supplierMapper.supplierToSupplierDto(supplierDto);
        SupplierDto supplierDtos = supplierMapper.supplierDtoToSupplier(supplierRepository.save(category)) ;
        return supplierDtos;
    }

    @Override
    public void deleteSupplierDto(Integer id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public List<SupplierDto> getSuppliers() {
        //Lista todos los registros
        List<Supplier> listProducts = supplierRepository.findAll();
        return SupplierMapper.INSTANCE.supplierDtoListToSupplierList(listProducts);

    }

    @Override
    public SupplierDto getSupplierDtoById(Integer id) {
        //Encuentra un registro
        Optional<Supplier> supplierId = supplierRepository.findById(id);
        if (supplierId.isPresent()) {
            return SupplierMapper.INSTANCE.supplierDtoToSupplier(supplierId.get());
        }
        return null;
    }
}
