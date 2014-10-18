package net.glowstone.inventory;

import org.bukkit.Material;

public interface MaterialMatcher {
    /**
     * Returns true if the given {@link org.bukkit.Material} matches the conditions of this MaterialMatcher.
     * @param material the {@link org.bukkit.Material} to check
     * @return true if it matches, false otherwise
     */
    public boolean matches(Material material);
}
