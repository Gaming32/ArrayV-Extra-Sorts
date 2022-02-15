package io.github.arrayv.sorts.misc;

import io.github.arrayv.main.ArrayVisualizer;
import io.github.arrayv.sorts.templates.Sort;

/*

CODED FOR ARRAYV BY PCBOYGAMES

------------------------------
- SORTING ALGORITHM MADHOUSE -
------------------------------

*/
final public class CupcakeWrapperSort extends Sort {
    public CupcakeWrapperSort(ArrayVisualizer arrayVisualizer) {
        super(arrayVisualizer);
        this.setSortListName("Cupcake Wrapper");
        this.setRunAllSortsName("Cupcake Wrapper Sort");
        this.setRunSortName("Cupcake Wrapper Sort");
        this.setCategory("Miscellaneous Sorts");
        this.setBucketSort(false);
        this.setRadixSort(false);
        this.setUnreasonablySlow(false);
        this.setUnreasonableLimit(0);
        this.setBogoSort(false);
    }

    @Override
    public void runSort(int[] array, int currentLength, int bucketCount) {
        int right = currentLength;
        for (int limit = currentLength - 1; limit >= 0; limit--) {
            for (right = limit; right > 0; right--) if (Reads.compareIndices(array, 0, right, 0.25, true) > 0) Writes.reversal(array, 0, right, 0.25, true, false);
            Writes.reversal(array, 0, currentLength - 1, 0.25, true, false);
            Writes.reversal(array, 0, currentLength - 2, 0.25, true, false);
        }
    }
}