package antibiotic.me;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class OnEntitySpawnEvent implements Listener{

	@EventHandler(priority = EventPriority.HIGH)
	public void onZombieSpawn(EntitySpawnEvent e) {
		Random ran = new Random();
		int x = 0;
		if(!(e.getEntity() instanceof Zombie)) {
			Location loc = e.getEntity().getLocation();
			x = ran.nextInt(10) + 1;
			if(x < 8) {
				Zombie z = (Zombie)loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				EntityEquipment ee = z.getEquipment();
				ee.setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
                Bukkit.broadcastMessage("8");
			}
            if(x < 6) {
				Zombie z = (Zombie)loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				EntityEquipment ee = z.getEquipment();
				ee.setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
                Bukkit.broadcastMessage("6");
			}
            if(x < 4) {
				Zombie z = (Zombie)loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				EntityEquipment ee = z.getEquipment();
				ee.setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
                Bukkit.broadcastMessage("4");
			}
            if(x < 2) {
				Zombie z = (Zombie)loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				EntityEquipment ee = z.getEquipment();
				ee.setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
                Bukkit.broadcastMessage("2");
			}
            if(x < 1) {
				Zombie z = (Zombie)loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				EntityEquipment ee = z.getEquipment();
				ee.setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
                Bukkit.broadcastMessage("1");
			}
		}
	}
}
