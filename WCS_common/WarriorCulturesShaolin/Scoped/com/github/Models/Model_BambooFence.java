package WarriorCulturesShaolin.Scoped.com.github.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Model_BambooFence extends ModelBase
{

  public ModelRenderer ShapeB2;
  
  public Model_BambooFence()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      ShapeB2 = new ModelRenderer(this, 0, 0);
      ShapeB2.addBox(-2F, 0F, -2F, 4, 16, 4);
      ShapeB2.setRotationPoint(0F, 8F, 0F);
      ShapeB2.setTextureSize(64, 32);
      ShapeB2.mirror = true;
      setRotation(ShapeB2, 0F, 0F, 0F);
  }
  
  public void renderBlock()
  {
	  ShapeB2.render(0.0625F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
	  
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  
  }
}
