package io.github.arrayv.sorts.distribute;

import io.github.arrayv.main.ArrayVisualizer;
import io.github.arrayv.sorts.templates.BogoSorting;

/*

PORTED TO ARRAYV BY PCBOYGAMES

------------------------------
- SORTING ALGORITHM MADHOUSE -
------------------------------

*/
public final class BovoSort extends BogoSorting {
    public BovoSort(ArrayVisualizer arrayVisualizer) {
        super(arrayVisualizer);
        this.setSortListName("Bovo");
        this.setRunAllSortsName("Bovo Sort");
        this.setRunSortName("Bovosort");
        this.setCategory("Impractical Sorts");
        this.setBucketSort(false);
        this.setRadixSort(false);
        this.setUnreasonablySlow(true);
        this.setUnreasonableLimit(11);
        this.setBogoSort(true);
    }

    @Override
    public void runSort(int[] array, int currentLength, int bucketCount) {
        int pull = 1;
        while (!this.isArraySorted(array, currentLength)) {
            pull = BogoSorting.randInt(0, currentLength - 1);
            while (pull >= 0) {
                Writes.swap(array, pull, pull + 1, this.delay, true, false);
                pull--;
            }
        }
    }
}