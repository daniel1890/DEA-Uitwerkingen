package nl.han.oose.dea.rest.resources;

import nl.han.oose.dea.rest.services.HardCodedItemService;
import nl.han.oose.dea.rest.services.ItemService;
import nl.han.oose.dea.rest.services.dto.ItemDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ItemCheckResourceTest {
    private ItemCheckResource sut;
    private ItemService itemService;

    @BeforeEach
    void setup() {
        this.sut = new ItemCheckResource();
        this.itemService = Mockito.mock(ItemService.class);
        this.sut.setIS(itemService);
    }

    @Test
    void getItemsReturnsAll() {
        // Arrange

        // Action
        sut.items();

        // Asserts
        verify(itemService).getAll();
    }

    @Test
    void getItemReturnsObjectFromServiceAsEntity() {
        // Arrange
        var itemsToReturn = new ArrayList<ItemDTO>();
        Mockito.when(itemService.getAll()).thenReturn(itemsToReturn);

        // Act
        var response = sut.items();

        // Assert
        Assertions.assertEquals(itemsToReturn, response.getEntity());
    }

}