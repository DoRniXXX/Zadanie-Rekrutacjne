package pl.app;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
			Block block1 = new Block() {
				public Materials getMaterial() {
					return Materials.CLAY;
				}
				
				public Colors getColor() {
					return Colors.BROWN;
				}
			};
			
			Block block2 = new Block() {
				public Materials getMaterial() {
					return Materials.CLAY;
				}
				
				public Colors getColor() {
					return Colors.RED;
				}
			};
			
			Block block3 = new Block() {
				public Materials getMaterial() {
					return Materials.STEEL;
				}
				
				public Colors getColor() {
					return Colors.SILVER;
				}
			};
			
			Block block4 = new Block() {
				public Materials getMaterial() {
					return Materials.IRON;
				}	
				public Colors getColor() {
					return Colors.DARKSILVER;
				}
			};	
			
	CompositeBlock compositeBlock = new CompositeBlock() {
		@Override
		public Materials getMaterial() {
			return Materials.REINFORCEDSTEEL;
		}
		
		@Override
		public Colors getColor() {
			return Colors.SILVER;
		}
		@Override
		public List<Block> getBlocks() {
			List<Block> inBlocks = new ArrayList<Block>();
			inBlocks.add(block1);
			inBlocks.add(block3);
			return  inBlocks;
		}
	};
	
	public List<Block> run(){
			List<Block> blocks = new ArrayList<Block>();
			blocks.add(block1);
			blocks.add(compositeBlock);
			blocks.add(null);
			blocks.add(block2);
			blocks.add(block3);
			blocks.add(block4);
			return blocks;
	}

}
