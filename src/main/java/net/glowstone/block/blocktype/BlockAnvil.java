package net.glowstone.block.blocktype;

import net.glowstone.block.GlowBlock;
import org.bukkit.Material;
import net.glowstone.entity.GlowPlayer;
import net.glowstone.inventory.GlowAnvilInventory;
import org.bukkit.block.BlockFace;
import org.bukkit.util.Vector;

public class BlockAnvil extends BlockFalling {
    public BlockAnvil() {
        super(Material.ANVIL);
    }

    @Override
    public boolean blockInteract(GlowPlayer player, GlowBlock block, BlockFace face, Vector clickedLoc) {
        return player.openInventory(new GlowAnvilInventory(player)) != null;
    }
    
    @Override
    protected void transformToFallingEntity(GlowBlock me) {
        me.setType(Material.AIR);
        me.getWorld().spawnFallingBlock(me.getLocation(), Material.ANVIL, me.getData());
    }    
}
