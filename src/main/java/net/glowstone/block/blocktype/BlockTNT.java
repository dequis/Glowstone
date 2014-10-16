package net.glowstone.block.blocktype;

import net.glowstone.block.GlowBlock;
import net.glowstone.entity.GlowTNTPrimed;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

public class BlockTNT extends BlockType {
    public void explodeBlock(GlowBlock tntBlock, boolean ignitedByExplosion) {
        tntBlock.setType(Material.AIR);
        World world = tntBlock.getWorld();
        GlowTNTPrimed tnt = (GlowTNTPrimed) world.spawnEntity(tntBlock.getLocation(), EntityType.PRIMED_TNT);
        tnt.setIgnitedByExplosion(ignitedByExplosion);
        world.playSound(tntBlock.getLocation(), Sound.FUSE, 1, 1);
    }

    public void explodeBlock(GlowBlock tntBlock) {
        this.explodeBlock(tntBlock, false);
    }
}
