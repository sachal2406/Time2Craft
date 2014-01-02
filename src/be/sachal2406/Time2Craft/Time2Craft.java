package be.sachal2406.Time2Craft;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import be.sachal2406.Time2Craft.Time2Craft;

public class Time2Craft extends JavaPlugin implements Listener{
	private Time2Craft listener;
	
	@Override
	public void onEnable() {
		
		listener = new Time2Craft();
		
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(listener, this);
		
		System.out.println("[Time2Craft] Chargé!");

        getServer().getPluginManager().registerEvents(this, this);
        File configFile = new File(getDataFolder(), "config.yml");

        if (!configFile.exists()) {
                saveDefaultConfig();
        }
        
	}

	@Override
	public void onDisable() {
		
		System.out.println("[Time2Craft] Déchargé!");
		
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerCommandPreproccess(PlayerCommandPreprocessEvent e){
	
	    Player p = e.getPlayer();
	    Server s = p.getServer();
	    String message = e.getMessage();
		
	    String[] params = message.split(" ");
		
	    if(params[0].equalsIgnoreCase("/pl")){
		    e.setCancelled(true);
			
		    p.sendMessage("Plugins (1): " + ChatColor.GREEN + "Time2Craft");

	    }else if(params[0].equalsIgnoreCase("/plugins")){
		    e.setCancelled(true);
			
		    p.sendMessage("Plugins (1): " + ChatColor.GREEN + "Time2Craft");

		}else if(params[0].equalsIgnoreCase("/ver")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Lolnop.");

		}else if(params[0].equalsIgnoreCase("/version")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Lolnop.");

		}else if(params[0].equalsIgnoreCase("/gc")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Lolnop.");

		}else if(params[0].equalsIgnoreCase("/help")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Lolnop.");

		}else if(params[0].equalsIgnoreCase("/?")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Lolnop.");

		}else if(params[0].equalsIgnoreCase("/bienvenue")){
		    e.setCancelled(true);
			
		    s.broadcastMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + p.getName() + " te souhaite la bienvenue! ;)");
		    
		}else if(params[0].equalsIgnoreCase("/site")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "Le site: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "http://time2craft.com");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		}else if(params[0].equalsIgnoreCase("/forum")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "Le forum: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "http://time2craft.com/forum");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		}else if(params[0].equalsIgnoreCase("/mumble")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "Mumble pas encore disponible");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		}else if(params[0].equalsIgnoreCase("/vote")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "Tu peux trouver les liens de vote ici:");
		    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "http://time2craft.com/?p=17");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		}else if(params[0].equalsIgnoreCase("/ts")){
		    e.setCancelled(true);
			
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "TeamSpeak pas encore disponible");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		}else if(params[0].equalsIgnoreCase("/regles")){
		    e.setCancelled(true);
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "-=-=-=-=Règles=-=-=-=-");
		    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "1) S'amuser");
		    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "2) Pas de propos obscènes");
		    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "3) Respecter les autres");
		    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "4) Pas de majuscules");
		    p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "5) Ecrire le mieux possibles");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    
		}else if(params[0].equalsIgnoreCase("/admins")){
		    e.setCancelled(true);
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "Les admins sont:");
		    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "[FONDATEUR]" + ChatColor.BLUE + "" + ChatColor.BOLD + "sachal2406");
		    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "[CO-FONDATEUR]" + ChatColor.BLUE + "" + ChatColor.BOLD + "JaJakara");
		    p.sendMessage("");
		    p.sendMessage(ChatColor.DARK_AQUA + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	    }
	}
	
	
	
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
    	
    	Player p = e.getPlayer();
    	e.setJoinMessage(ChatColor.GOLD + "" + ChatColor.BOLD + p.getName() + ChatColor.BLUE + " a rejoint le serveur!");
    	System.out.println(ChatColor.GOLD + "" + ChatColor.BOLD + p.getName() + ChatColor.BLUE + " a rejoint le serveur!"); 
    }
    
    
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e){
    	
    	Player p = e.getPlayer();
    	
    	e.setQuitMessage(ChatColor.GOLD + "" + ChatColor.BOLD + p.getName() + ChatColor.RED + " a quitté le serveur!");
    }
   
}