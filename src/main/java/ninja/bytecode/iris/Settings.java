package ninja.bytecode.iris;

import ninja.bytecode.iris.util.InterpolationMode;
import ninja.bytecode.iris.util.ObjectMode;
import ninja.bytecode.iris.util.PerformanceMode;

public class Settings
{
	public PerformanceSettings performance = new PerformanceSettings();
	public GeneratorSettings gen = new GeneratorSettings();

	public static class PerformanceSettings
	{
		public PerformanceMode performanceMode = PerformanceMode.HALF_CPU;
		public ObjectMode objectMode = ObjectMode.FAST_LIGHTING;
		public boolean fastMode = false;
		public int threadPriority = Thread.MAX_PRIORITY;
		public int threadCount = 4;
		public boolean debugMode = true;
		public int decorationAccuracy = 2;
		public boolean noObjectFail = false;
		public boolean verbose = true;
		public int placeHistoryLimit = 8192;
	}

	public static class GeneratorSettings
	{
		public InterpolationMode interpolationMode = InterpolationMode.BILINEAR;
		public int interpolationRadius = 5;
		public double objectDensity = 1D;
		public double horizontalZoom = 2;
		public double heightFracture = 155;
		public double landScale = 0.75;
		public double landChance = 0.55;
		public double roughness = 1.55;
		public double biomeEdgeScrambleScale = 1;
		public double heightMultiplier = 0.806;
		public double heightExponentBase = 1;
		public double heightExponentMultiplier = 1.41;
		public double heightScale = 0.56;
		public double baseHeight = 0.065;
		public int seaLevel = 63;
		public double caveDensity = 5;
		public double caveScale = 1.2;
		public double biomeScale = 0.65;
		public boolean flatBedrock = true;
		public boolean genCarving = true;
		public boolean genCaverns = true;
		public boolean genCaves = true;
		public double carvingChance = 0.352;
		public double cavernChance = 0.321;
		public int minCarvingHeight = 75;
		public int maxCarvingHeight = 155;
		public int minCavernHeight = 14;
		public int maxCavernHeight = 54;
	}
}
