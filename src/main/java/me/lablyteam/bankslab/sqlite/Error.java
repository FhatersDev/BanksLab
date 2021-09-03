package me.lablyteam.bankslab.sqlite;

import me.lablyteam.bankslab.BanksLabMain;

import java.util.logging.Level;



public class Error {
    public static void execute(BanksLabMain plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Couldn't execute MySQL statement: ", ex);
    }
    public static void close(BanksLabMain plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Failed to close MySQL connection: ", ex);
    }
}