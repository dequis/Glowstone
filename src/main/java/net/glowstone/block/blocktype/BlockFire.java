package net.glowstone.block.blocktype;

import net.glowstone.block.GlowBlock;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;

public class BlockFire extends BlockDropless {

    @Override
    public boolean canOverride(GlowBlock block, BlockFace face, ItemStack holding) {
        return true;
    }

    @Override
    public void onNearBlockChanges(GlowBlock me, BlockFace position, GlowBlock other, Material oldType, byte oldData, Material newType, byte newData) {
        if (position == BlockFace.DOWN)
            updatePhysics(me);
    }

    @Override
    public void updatePhysics(GlowBlock me) {
        if (me.getRelative(BlockFace.DOWN).getType() == Material.AIR)
            me.setType(Material.AIR);
    }
}
