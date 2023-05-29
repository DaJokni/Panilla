package com.ruinscraft.panilla.v1_13_R2.nbt;

import com.ruinscraft.panilla.api.nbt.INbtTagCompound;
import com.ruinscraft.panilla.api.nbt.INbtTagList;
import com.ruinscraft.panilla.api.nbt.NbtDataType;

import net.minecraft.server.v1_13_R2.NBTTagCompound;

public class NbtTagCompound implements INbtTagCompound {

	private final NBTTagCompound handle;
	
	public NbtTagCompound(NBTTagCompound handle) {
		this.handle = handle;
	}
	
	@Override
	public boolean hasKey(String key) {
		return handle.hasKey(key);
	}

	@Override
	public int getInt(String key) {
		return handle.getInt(key);
	}
	
	@Override
	public short getShort(String key) {
		return handle.getShort(key);
	}

	@Override
	public String getString(String key) {
		return handle.getString(key);
	}

	@Override
	public INbtTagList getList(String key, NbtDataType nbtDataType) {
		return new NbtTagList(handle.getList(key, nbtDataType.id));
	}

	@Override
	public INbtTagCompound getCompound(String key) {
		return new NbtTagCompound(handle.getCompound(key));
	}
	
}