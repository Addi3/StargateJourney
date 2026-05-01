package net.povstalec.sgjourney.common.compatibility.cctweaked.methods;

import dan200.computercraft.api.lua.IArguments;
import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.lua.MethodResult;
import dan200.computercraft.api.peripheral.IComputerAccess;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.povstalec.sgjourney.common.block_entities.stargate.IrisStargateEntity;
import net.povstalec.sgjourney.common.block_entities.tech_interface.AbstractInterfaceEntity;
import net.povstalec.sgjourney.common.compatibility.computer_functions.IrisFunctions;
import net.povstalec.sgjourney.common.init.SoundInit;

public class IrisMethods
{
	public static class GetIris implements InterfaceMethod<IrisStargateEntity>
	{
		@Override
		public String getName()
		{
			return "getIris";
		}
		
		@Override
		public MethodResult use(IComputerAccess computer, ILuaContext context, AbstractInterfaceEntity interfaceEntity, IrisStargateEntity stargate, IArguments arguments) throws LuaException
		{
			return context.executeMainThreadTask(() -> new Object[] {IrisFunctions.getIris(stargate)});
		}
	}

	public static class CloseIris implements InterfaceMethod<IrisStargateEntity>
	{
		@Override
		public String getName()
		{
			return "closeIris";
		}

		@Override
		public MethodResult use(IComputerAccess computer, ILuaContext context, AbstractInterfaceEntity interfaceEntity, IrisStargateEntity stargate, IArguments arguments) throws LuaException
		{
			playIrisSound(stargate, "close");

			return context.executeMainThreadTask(() -> new Object[] {IrisFunctions.closeIris(interfaceEntity)});
		}
	}

	public static class OpenIris implements InterfaceMethod<IrisStargateEntity>
	{
		@Override
		public String getName()
		{
			return "openIris";
		}

		@Override
		public MethodResult use(IComputerAccess computer, ILuaContext context, AbstractInterfaceEntity interfaceEntity, IrisStargateEntity stargate, IArguments arguments) throws LuaException
		{
			playIrisSound(stargate, "open");

			return context.executeMainThreadTask(() -> new Object[] {IrisFunctions.openIris(interfaceEntity)});
		}
	}

	private static void playIrisSound(IrisStargateEntity stargate, String action)
	{
		if(stargate == null || stargate.getLevel() == null || stargate.getLevel().isClientSide)
			return;

		ServerLevel level = (ServerLevel) stargate.getLevel();
		BlockPos pos = stargate.getBlockPos();

		if(action.equals("open"))
		{
			level.playSound(null, pos, SoundInit.IRIS_OPEN.get(),
					SoundSource.BLOCKS, 1.0F, 1.0F);
		}
		else if(action.equals("close"))
		{
			level.playSound(null, pos, SoundInit.IRIS_CLOSE.get(),
					SoundSource.BLOCKS, 1.0F, 1.0F);
		}
	}
	
	public static class StopIris implements InterfaceMethod<IrisStargateEntity>
	{
		@Override
		public String getName()
		{
			return "stopIris";
		}

		@Override
		public MethodResult use(IComputerAccess computer, ILuaContext context, AbstractInterfaceEntity interfaceEntity, IrisStargateEntity stargate, IArguments arguments) throws LuaException
		{
			return context.executeMainThreadTask(() -> new Object[] {IrisFunctions.stopIris(interfaceEntity)});
		}
	}
	
	public static class GetIrisProgress implements InterfaceMethod<IrisStargateEntity>
	{
		@Override
		public String getName()
		{
			return "getIrisProgress";
		}

		@Override
		public MethodResult use(IComputerAccess computer, ILuaContext context, AbstractInterfaceEntity interfaceEntity, IrisStargateEntity stargate, IArguments arguments) throws LuaException
		{
			return context.executeMainThreadTask(() -> new Object[] {IrisFunctions.getIrisProgress(stargate)});
		}
	}
	
	public static class GetIrisProgressPercentage implements InterfaceMethod<IrisStargateEntity>
	{
		@Override
		public String getName()
		{
			return "getIrisProgressPercentage";
		}

		@Override
		public MethodResult use(IComputerAccess computer, ILuaContext context, AbstractInterfaceEntity interfaceEntity, IrisStargateEntity stargate, IArguments arguments) throws LuaException
		{
			return context.executeMainThreadTask(() -> new Object[] {IrisFunctions.getIrisProgressPercentage(stargate)});
		}
	}
	
	public static class GetIrisDurability implements InterfaceMethod<IrisStargateEntity>
	{
		@Override
		public String getName()
		{
			return "getIrisDurability";
		}
		
		@Override
		public MethodResult use(IComputerAccess computer, ILuaContext context, AbstractInterfaceEntity interfaceEntity, IrisStargateEntity stargate, IArguments arguments) throws LuaException
		{
			return context.executeMainThreadTask(() -> new Object[] {IrisFunctions.getIrisDurability(stargate)});
		}
	}
	
	public static class GetIrisMaxDurability implements InterfaceMethod<IrisStargateEntity>
	{
		@Override
		public String getName()
		{
			return "getIrisMaxDurability";
		}
		
		@Override
		public MethodResult use(IComputerAccess computer, ILuaContext context, AbstractInterfaceEntity interfaceEntity, IrisStargateEntity stargate, IArguments arguments) throws LuaException
		{
			return context.executeMainThreadTask(() -> new Object[] {IrisFunctions.getIrisMaxDurability(stargate)});
		}
	}
}
