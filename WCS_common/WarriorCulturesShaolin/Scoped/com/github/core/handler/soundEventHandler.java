package WarriorCulturesShaolin.Scoped.com.github.core.handler;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class soundEventHandler
{
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event)
	{
		event.manager.addSound("mod_id:hit.ogg");
	}
}
