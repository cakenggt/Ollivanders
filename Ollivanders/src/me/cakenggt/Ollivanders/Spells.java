package Spell;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import me.cakenggt.Ollivanders.Ollivanders;
import me.cakenggt.Ollivanders.Spells;
import me.cakenggt.Ollivanders.Transfiguration;

/**Changes color of sheep and colorable blocks
 * @author lownes
 *
 */
public class CALAMUS extends Transfiguration implements Spell{

	public CALAMUS(Ollivanders plugin, Player player, Spells name,
			Double rightWand) {
		super(plugin, player, name, rightWand);
	}

	public void checkEffect() {
	            move();
	            for (Block e : getBlocksInRadius(location, usesModifier/10)){
	                	if(e.getType() == Material.STICK){
	                    e.setType(Material.ARROW);
	                    return;
	            		
	            }
	        
	            
	                	else if (lifeTicks > 160){
	                kill = true;
	                if (location.getBlock().getType() == Material.ARROW){
	                    location.getBlock().setType(Material.STICK);
	                }
	            }
	            else{
	                lifeTicks ++;
	                if (location.getBlock().getType() != Material.ARROW){
	                    kill = true;
	                }
	            }
	        }
	}
	
}
