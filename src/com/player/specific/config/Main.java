package com.player.specific.config;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.player.specific.config.events.PlayerJoin;

public class Main extends JavaPlugin {

	public Logger logger = getLogger();

	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		logger.info(pdfFile.getName() + " Has Been Enabled! Version: " + pdfFile.getVersion());
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerJoin(), this);
	}

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		logger.info(pdfFile.getName() + " Has Been Disabled!");
	}
}
