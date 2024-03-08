package net.mcreator.golden.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class FlyprocedureProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		if ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "target");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()) instanceof Player _player) {
			_player.getAbilities().mayfly = (BoolArgumentType.getBool(arguments, "fly") == true);
			_player.onUpdateAbilities();
		}
		if (BoolArgumentType.getBool(arguments, "fly") == false) {
			if ((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "target");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()) instanceof Player _player) {
				_player.getAbilities().flying = (BoolArgumentType.getBool(arguments, "fly") == true);
				_player.onUpdateAbilities();
			}
		}
	}
}
