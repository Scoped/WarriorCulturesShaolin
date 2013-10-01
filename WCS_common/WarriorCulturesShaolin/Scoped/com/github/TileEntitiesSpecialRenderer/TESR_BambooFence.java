package WarriorCulturesShaolin.Scoped.com.github.TileEntitiesSpecialRenderer;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import WarriorCulturesShaolin.Scoped.com.github.Models.Model_BambooFence;
import WarriorCulturesShaolin.Scoped.com.github.lib.Reference;

public class TESR_BambooFence extends TileEntitySpecialRenderer
{
	private static final float pixelSize = 0.0625f;
	public Model_BambooFence model = new Model_BambooFence();
    
	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float partialTickTime)
	  {
		GL11.glPushMatrix();
	  	GL11.glTranslatef((float)x + 8 * pixelSize, (float)y + -8 * pixelSize, (float)z + 8 * pixelSize);
	  	GL11.glRotatef(0, 0, 0, 0);
	  	this.model.ShapeB2.render(pixelSize);
		GL11.glPopMatrix();
	  }
}
