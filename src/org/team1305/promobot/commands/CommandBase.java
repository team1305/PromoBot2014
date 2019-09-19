package org.team1305.promobot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.team1305.promobot.OI;
import org.team1305.promobot.subsystems.DriveBase;
import org.team1305.promobot.subsystems.Lights;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static DriveBase driveBase = new DriveBase();
    public static Lights light = new Lights();
        
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        

        // Show what command your subsystem is running on the SmartDashboard
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
