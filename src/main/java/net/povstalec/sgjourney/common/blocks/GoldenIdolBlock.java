package net.povstalec.sgjourney.common.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GoldenIdolBlock extends HorizontalDirectionalBlock
{
	private static final VoxelShape ARTIFACT_HEAD = Block.box(4, 0, 4, 12, 16, 12);
	
	private static final VoxelShape ARTIFACT_STRAIGHT = Shapes.or(ARTIFACT_HEAD);
	private static final VoxelShape ARTIFACT_TURNED = Shapes.or(ARTIFACT_HEAD);

	public static final MapCodec<GoldenIdolBlock> CODEC = simpleCodec(GoldenIdolBlock::new);

	public GoldenIdolBlock(Properties properties)
	{
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	protected MapCodec<GoldenIdolBlock> codec()
	{
		return CODEC;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> state)
	{
		state.add(FACING);
	}
	
	public BlockState rotate(BlockState state, Rotation rotation)
	{
		return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
	}
	
	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) 
	{
		return true;
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) 
	{
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collision) 
	{
		Direction direction = state.getValue(FACING);
		return direction.getAxis() == Direction.Axis.X ? ARTIFACT_TURNED : ARTIFACT_STRAIGHT;
	}
}
