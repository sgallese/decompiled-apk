package j$.util.stream;

/* loaded from: classes2.dex */
abstract class AbstractSpinedBuffer {
    protected int elementIndex;
    protected final int initialChunkPower;
    protected long[] priorElementCount;
    protected int spineIndex;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractSpinedBuffer() {
        this.initialChunkPower = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractSpinedBuffer(int i10) {
        if (i10 >= 0) {
            this.initialChunkPower = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int chunkSize(int i10) {
        return 1 << ((i10 == 0 || i10 == 1) ? this.initialChunkPower : Math.min((this.initialChunkPower + i10) - 1, 30));
    }

    public abstract void clear();

    public long count() {
        int i10 = this.spineIndex;
        return i10 == 0 ? this.elementIndex : this.priorElementCount[i10] + this.elementIndex;
    }
}
