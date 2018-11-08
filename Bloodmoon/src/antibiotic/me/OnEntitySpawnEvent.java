package antibiotic.me;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class OnEntitySpawnEvent implements Listener{
	//Add some damn comments
	@EventHandler(priority = EventPriority.HIGH)
	public void onZombieSpawn(EntitySpawnEvent e) {
		Random ran = new Random();
		int x = 0;
		if(!(e.getEntity() instanceof Zombie)) {
			Location loc = e.getEntity().getLocation();
			x = ran.nextInt(5) + 1;
			for(int i = x; i > 0; i--) {
				Zombie z = (Zombie)loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				EntityEquipment ee = z.getEquipment();
				ee.setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
				System.out.println("Zombie spawned at: " + loc);
			}
		}
	}
}