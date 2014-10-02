package net.glowstone.inventory;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.EnchantingInventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class GlowEnchantingInventory extends GlowInventory implements EnchantingInventory {

    private static final int ITEM_SLOT = 0;
    private static final int LAPIS_SLOT = 1;

    public GlowEnchantingInventory(InventoryHolder holder) {
        super(holder, InventoryType.ENCHANTING);

        slotTypes[ITEM_SLOT] = InventoryType.SlotType.CRAFTING;
        slotTypes[LAPIS_SLOT] = InventoryType.SlotType.CRAFTING;
    }

    @Override
    public int getNumSlots() {
        return 0;
    }

    @Override
    public void setItem(ItemStack item) {
        setItem(ITEM_SLOT, item);
        //TODO: Enchanting stuff
    }

    @Override
    public ItemStack getItem() {
        return getItem(ITEM_SLOT);
    }

    @Override
    public void setLapis(ItemStack item) {
        //TODO: Prevent non-lapis items
        setItem(LAPIS_SLOT, item);
    }

    @Override
    public ItemStack getLapis() {
        return getItem(LAPIS_SLOT);
    }
}
