package net.bin.lacomarca.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.bin.lacomarca.world.inventory.TradesMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TradesScreen extends AbstractContainerScreen<TradesMenu> {
	private final static HashMap<String, Object> guistate = TradesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty1;
	Button button_empty;

	public TradesScreen(TradesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 259;
		this.imageHeight = 172;
	}

	private static final ResourceLocation texture = new ResourceLocation("lacomarca:textures/screens/trades.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
	}
}
