package ij.measure;

public interface Measurements {

    public static final int AREA = 1, MEAN = 2, STD_DEV = 4, MODE = 8, MIN_MAX = 16,
            CENTROID = 32, CENTER_OF_MASS = 64, PERIMETER = 128, LIMIT = 256, RECT = 512,
            LABELS = 1024, ELLIPSE = 2048, INVERT_Y = 4096, CIRCULARITY = 8192,
            SHAPE_DESCRIPTORS = 8192, FERET = 16384, INTEGRATED_DENSITY = 0x8000,
            MEDIAN = 0x10000, SKEWNESS = 0x20000, KURTOSIS = 0x40000, AREA_FRACTION = 0x80000,
            SLICE = 0x100000, STACK_POSITION = 0x100000, SCIENTIFIC_NOTATION = 0x200000,
            ADD_TO_OVERLAY = 0x400000, NaN_EMPTY_CELLS = 0x800000;

    /**
     * Maximum number of calibration standard (20)
     */
    public static final int MAX_STANDARDS = 20;

    /**
     * All measurement options
     */
    public static final int ALL_STATS = AREA + MEAN + STD_DEV + MODE + MIN_MAX
            + CENTROID + CENTER_OF_MASS + PERIMETER + RECT
            + ELLIPSE + SHAPE_DESCRIPTORS + FERET + INTEGRATED_DENSITY
            + MEDIAN + SKEWNESS + KURTOSIS + AREA_FRACTION;

}
