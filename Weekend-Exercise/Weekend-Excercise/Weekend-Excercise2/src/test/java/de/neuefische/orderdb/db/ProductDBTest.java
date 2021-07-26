package de.neuefische.orderdb.db;

import de.neuefische.orderdb.model.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {

    @Test
    @DisplayName("listProducts should return all available Products")

    public void testListProducts() {
        // Given
        List<Product> products = List.of(
                new Product("1", "beer"),
                new Product("2", "apple"),
                new Product("3", "tomato")
        );
        ProductDB productDB = new ProductDB(products);

        // When
        List<Product> actual = productDB.listProducts();

        // Then
        assertEquals(List.of(
                new Product("1", "beer"),
                new Product("2", "apple"),
                new Product("3", "tomato")
        ), actual);

    }

    @Test
    @DisplayName("getProductById should return product with matching id")

    public void testGetProductByIdWithExistingId() {
        // Given
        List<Product> products = List.of(
                new Product("1", "beer"),
                new Product("2", "apple"),
                new Product("3", "tomato")
        );
        ProductDB productDB = new ProductDB(products);

        // When
        Optional<Product> actual = productDB.getProductById("2");

        // Then
        assertEquals(new Product("2", "apple"), actual.get());
    }

    @Test
    @DisplayName("getProductById with non existing id shoul return empty optional")

    public void testGetProductIdWithNonExistingId() {
        // Given
        List<Product> products = List.of(
                new Product("1", "beer"),
                new Product("2", "apple"),
                new Product("3", "tomato")
        );
        ProductDB productDB = new ProductDB(products);

        // When
        Optional<Product> actual = productDB.getProductById("4");

        // Then
        assertTrue(actual.isEmpty());
    }
}