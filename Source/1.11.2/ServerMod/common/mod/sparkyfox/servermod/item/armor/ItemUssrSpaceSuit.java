package mod.sparkyfox.servermod.item.armor;

import mod.sparkyfox.servermod.ServerMod;
import mod.sparkyfox.servermod.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemUssrSpaceSuit extends ItemArmor {

	public ItemUssrSpaceSuit(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, 0, equipmentSlotIn);
		
		

	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		if (slot == EntityEquipmentSlot.HEAD || slot == EntityEquipmentSlot.CHEST || slot == EntityEquipmentSlot.FEET) {
			return ServerMod.MOD_ID + ":textures/armor/commiespacesuit_1.png";
		} else if (slot == EntityEquipmentSlot.CHEST || slot == EntityEquipmentSlot.LEGS) {
			return ServerMod.MOD_ID + ":textures/armor/commiespacesuit_2.png";
		} else {
			return null;
	}
		}
	
													//Equip on Right Click\\
	
		  public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		    {
		        ItemStack itemstack = playerIn.getHeldItem(handIn);
		        EntityEquipmentSlot entityequipmentslot = EntityLiving.getSlotForItemStack(itemstack);
		        ItemStack itemstack1 = playerIn.getItemStackFromSlot(entityequipmentslot);

		        if (itemstack1.isEmpty())
		        {
		            playerIn.setItemStackToSlot(entityequipmentslot, itemstack.copy());
		            itemstack.setCount(0);
		            return new ActionResult(EnumActionResult.SUCCESS, itemstack);
		        }
		        else
		        {
		            return new ActionResult(EnumActionResult.FAIL, itemstack);
		        }
		    
		    }
		  @Override
		  public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		  if (itemStack.getItem().equals(ModItems.CPSpaceChestplate))
		      player.addPotionEffect(new PotionEffect(Potion.getPotionById(13)));
		  {

		  }
					
	}
				// TODO Auto-generated method stub
		  
		  
																//Anvil Repair\\


		        		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		        		return repair.getItem() == ModItems.CraftingHammer;
		        		
		        		}

		        													//Crafting Recipe\\
		        		
		        		public void addRecipes() {
		        			GameRegistry.addShapedRecipe(new ItemStack(ModItems.CPSpaceHelmet), "III", "FGF", "III", 'I', Items.IRON_INGOT, 'G',
		        					new ItemStack (Blocks.GLASS_PANE), 'F', new ItemStack (ModItems.CommieFabric));
		        		{
		        			
		        		}
			        		GameRegistry.addShapedRecipe(new ItemStack(ModItems.CPSpaceChestplate), "K K", "KKK", "KKK", 'K', ModItems.CommieFabric);
		
			        	{
			        			
			        	}
			        		GameRegistry.addShapedRecipe(new ItemStack(ModItems.CPSpaceLeggings), "KKK", "KKK", "K K", 'K', ModItems.CommieFabric);	
		
			        	{
			        			
			        	}
		        	
			        	   GameRegistry.addShapedRecipe(new ItemStack(ModItems.CPSpaceBoots), "   ", "K K", "K K", 'K', ModItems.CommieFabric);	
		
			        		}
			        		
						}