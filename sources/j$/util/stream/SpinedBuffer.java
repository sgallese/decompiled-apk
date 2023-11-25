package j$.util.stream;

import androidx.recyclerview.widget.m;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SpinedBuffer extends AbstractSpinedBuffer implements Consumer, Iterable {
    protected Object[] curChunk = new Object[1 << this.initialChunkPower];
    protected Object[][] spine;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.util.stream.SpinedBuffer$1Splitr  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class C1Splitr implements Spliterator {
        final int lastSpineElementFence;
        final int lastSpineIndex;
        Object[] splChunk;
        int splElementIndex;
        int splSpineIndex;

        C1Splitr(int i10, int i11, int i12, int i13) {
            this.splSpineIndex = i10;
            this.lastSpineIndex = i11;
            this.splElementIndex = i12;
            this.lastSpineElementFence = i13;
            Object[][] objArr = SpinedBuffer.this.spine;
            this.splChunk = objArr == null ? SpinedBuffer.this.curChunk : objArr[i10];
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 16464;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            int i10 = this.splSpineIndex;
            int i11 = this.lastSpineIndex;
            if (i10 == i11) {
                return this.lastSpineElementFence - this.splElementIndex;
            }
            long[] jArr = SpinedBuffer.this.priorElementCount;
            return ((jArr[i11] + this.lastSpineElementFence) - jArr[i10]) - this.splElementIndex;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            int i10;
            Objects.requireNonNull(consumer);
            int i11 = this.splSpineIndex;
            int i12 = this.lastSpineIndex;
            if (i11 < i12 || (i11 == i12 && this.splElementIndex < this.lastSpineElementFence)) {
                int i13 = this.splElementIndex;
                while (true) {
                    i10 = this.lastSpineIndex;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = SpinedBuffer.this.spine[i11];
                    while (i13 < objArr.length) {
                        consumer.accept(objArr[i13]);
                        i13++;
                    }
                    i11++;
                    i13 = 0;
                }
                Object[] objArr2 = this.splSpineIndex == i10 ? this.splChunk : SpinedBuffer.this.spine[i10];
                int i14 = this.lastSpineElementFence;
                while (i13 < i14) {
                    consumer.accept(objArr2[i13]);
                    i13++;
                }
                this.splSpineIndex = this.lastSpineIndex;
                this.splElementIndex = this.lastSpineElementFence;
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i10) {
            return Spliterator.CC.$default$hasCharacteristics(this, i10);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            Objects.requireNonNull(consumer);
            int i10 = this.splSpineIndex;
            int i11 = this.lastSpineIndex;
            if (i10 < i11 || (i10 == i11 && this.splElementIndex < this.lastSpineElementFence)) {
                Object[] objArr = this.splChunk;
                int i12 = this.splElementIndex;
                this.splElementIndex = i12 + 1;
                consumer.accept(objArr[i12]);
                if (this.splElementIndex == this.splChunk.length) {
                    this.splElementIndex = 0;
                    int i13 = this.splSpineIndex + 1;
                    this.splSpineIndex = i13;
                    Object[][] objArr2 = SpinedBuffer.this.spine;
                    if (objArr2 != null && i13 <= this.lastSpineIndex) {
                        this.splChunk = objArr2[i13];
                    }
                }
                return true;
            }
            return false;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i10 = this.splSpineIndex;
            int i11 = this.lastSpineIndex;
            if (i10 < i11) {
                SpinedBuffer spinedBuffer = SpinedBuffer.this;
                C1Splitr c1Splitr = new C1Splitr(i10, i11 - 1, this.splElementIndex, spinedBuffer.spine[i11 - 1].length);
                int i12 = this.lastSpineIndex;
                this.splSpineIndex = i12;
                this.splElementIndex = 0;
                this.splChunk = SpinedBuffer.this.spine[i12];
                return c1Splitr;
            } else if (i10 == i11) {
                int i13 = this.lastSpineElementFence;
                int i14 = this.splElementIndex;
                int i15 = (i13 - i14) / 2;
                if (i15 == 0) {
                    return null;
                }
                Spliterator spliterator = DesugarArrays.spliterator(this.splChunk, i14, i14 + i15);
                this.splElementIndex += i15;
                return spliterator;
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class OfDouble extends OfPrimitive implements DoubleConsumer {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j$.util.stream.SpinedBuffer$OfDouble$1Splitr  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class C1Splitr extends OfPrimitive.BaseSpliterator implements Spliterator.OfDouble {
            C1Splitr(int i10, int i11, int i12, int i13) {
                super(i10, i11, i12, i13);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public void arrayForOne(double[] dArr, int i10, DoubleConsumer doubleConsumer) {
                doubleConsumer.accept(dArr[i10]);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public Spliterator.OfDouble arraySpliterator(double[] dArr, int i10, int i11) {
                return DesugarArrays.spliterator(dArr, i10, i11 + i10);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfDouble.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator.OfDouble
            public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
                super.forEachRemaining((Object) doubleConsumer);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public C1Splitr newSpliterator(int i10, int i11, int i12, int i13) {
                return new C1Splitr(i10, i11, i12, i13);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfDouble
            public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
                return super.tryAdvance((Object) doubleConsumer);
            }

            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
                return (Spliterator.OfDouble) super.trySplit();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfDouble() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfDouble(int i10) {
            super(i10);
        }

        public void accept(double d10) {
            preAccept();
            double[] dArr = (double[]) this.curChunk;
            int i10 = this.elementIndex;
            this.elementIndex = i10 + 1;
            dArr[i10] = d10;
        }

        public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
            return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public void arrayForEach(double[] dArr, int i10, int i11, DoubleConsumer doubleConsumer) {
            while (i10 < i11) {
                doubleConsumer.accept(dArr[i10]);
                i10++;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public int arrayLength(double[] dArr) {
            return dArr.length;
        }

        @Override // java.lang.Iterable
        public void forEach(Consumer consumer) {
            if (consumer instanceof DoubleConsumer) {
                forEach((DoubleConsumer) consumer);
                return;
            }
            if (Tripwire.ENABLED) {
                Tripwire.trip(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            }
            spliterator().forEachRemaining(consumer);
        }

        public double get(long j10) {
            int chunkFor = chunkFor(j10);
            return (this.spineIndex == 0 && chunkFor == 0) ? ((double[]) this.curChunk)[(int) j10] : ((double[][]) this.spine)[chunkFor][(int) (j10 - this.priorElementCount[chunkFor])];
        }

        @Override // java.lang.Iterable
        public PrimitiveIterator.OfDouble iterator() {
            return Spliterators.iterator(spliterator());
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public double[] newArray(int i10) {
            return new double[i10];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public double[][] newArrayArray(int i10) {
            return new double[i10];
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, java.lang.Iterable, j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        public Spliterator.OfDouble spliterator() {
            return new C1Splitr(0, this.spineIndex, 0, this.elementIndex);
        }

        public String toString() {
            double[] dArr = (double[]) asPrimitiveArray();
            return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.spineIndex), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.spineIndex), Arrays.toString(Arrays.copyOf(dArr, (int) m.e.DEFAULT_DRAG_ANIMATION_DURATION)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class OfInt extends OfPrimitive implements IntConsumer {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j$.util.stream.SpinedBuffer$OfInt$1Splitr  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class C1Splitr extends OfPrimitive.BaseSpliterator implements Spliterator.OfInt {
            C1Splitr(int i10, int i11, int i12, int i13) {
                super(i10, i11, i12, i13);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public void arrayForOne(int[] iArr, int i10, IntConsumer intConsumer) {
                intConsumer.accept(iArr[i10]);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public Spliterator.OfInt arraySpliterator(int[] iArr, int i10, int i11) {
                return DesugarArrays.spliterator(iArr, i10, i11 + i10);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator.OfInt
            public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
                super.forEachRemaining((Object) intConsumer);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public C1Splitr newSpliterator(int i10, int i11, int i12, int i13) {
                return new C1Splitr(i10, i11, i12, i13);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfInt
            public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
                return super.tryAdvance((Object) intConsumer);
            }

            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
                return (Spliterator.OfInt) super.trySplit();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt(int i10) {
            super(i10);
        }

        public void accept(int i10) {
            preAccept();
            int[] iArr = (int[]) this.curChunk;
            int i11 = this.elementIndex;
            this.elementIndex = i11 + 1;
            iArr[i11] = i10;
        }

        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
            return IntConsumer$CC.$default$andThen(this, intConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public void arrayForEach(int[] iArr, int i10, int i11, IntConsumer intConsumer) {
            while (i10 < i11) {
                intConsumer.accept(iArr[i10]);
                i10++;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public int arrayLength(int[] iArr) {
            return iArr.length;
        }

        @Override // java.lang.Iterable
        public void forEach(Consumer consumer) {
            if (consumer instanceof IntConsumer) {
                forEach((IntConsumer) consumer);
                return;
            }
            if (Tripwire.ENABLED) {
                Tripwire.trip(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            }
            spliterator().forEachRemaining(consumer);
        }

        public int get(long j10) {
            int chunkFor = chunkFor(j10);
            return (this.spineIndex == 0 && chunkFor == 0) ? ((int[]) this.curChunk)[(int) j10] : ((int[][]) this.spine)[chunkFor][(int) (j10 - this.priorElementCount[chunkFor])];
        }

        @Override // java.lang.Iterable
        public PrimitiveIterator.OfInt iterator() {
            return Spliterators.iterator(spliterator());
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public int[] newArray(int i10) {
            return new int[i10];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public int[][] newArrayArray(int i10) {
            return new int[i10];
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, java.lang.Iterable, j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        public Spliterator.OfInt spliterator() {
            return new C1Splitr(0, this.spineIndex, 0, this.elementIndex);
        }

        public String toString() {
            int[] iArr = (int[]) asPrimitiveArray();
            return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.spineIndex), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.spineIndex), Arrays.toString(Arrays.copyOf(iArr, (int) m.e.DEFAULT_DRAG_ANIMATION_DURATION)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class OfLong extends OfPrimitive implements LongConsumer {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j$.util.stream.SpinedBuffer$OfLong$1Splitr  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class C1Splitr extends OfPrimitive.BaseSpliterator implements Spliterator.OfLong {
            C1Splitr(int i10, int i11, int i12, int i13) {
                super(i10, i11, i12, i13);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public void arrayForOne(long[] jArr, int i10, LongConsumer longConsumer) {
                longConsumer.accept(jArr[i10]);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public Spliterator.OfLong arraySpliterator(long[] jArr, int i10, int i11) {
                return DesugarArrays.spliterator(jArr, i10, i11 + i10);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfLong.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator.OfLong
            public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
                super.forEachRemaining((Object) longConsumer);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator
            public C1Splitr newSpliterator(int i10, int i11, int i12, int i13) {
                return new C1Splitr(i10, i11, i12, i13);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfLong.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfLong
            public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
                return super.tryAdvance((Object) longConsumer);
            }

            @Override // j$.util.stream.SpinedBuffer.OfPrimitive.BaseSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
                return (Spliterator.OfLong) super.trySplit();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong(int i10) {
            super(i10);
        }

        public void accept(long j10) {
            preAccept();
            long[] jArr = (long[]) this.curChunk;
            int i10 = this.elementIndex;
            this.elementIndex = i10 + 1;
            jArr[i10] = j10;
        }

        public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
            return LongConsumer$CC.$default$andThen(this, longConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public void arrayForEach(long[] jArr, int i10, int i11, LongConsumer longConsumer) {
            while (i10 < i11) {
                longConsumer.accept(jArr[i10]);
                i10++;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public int arrayLength(long[] jArr) {
            return jArr.length;
        }

        @Override // java.lang.Iterable
        public void forEach(Consumer consumer) {
            if (consumer instanceof LongConsumer) {
                forEach((LongConsumer) consumer);
                return;
            }
            if (Tripwire.ENABLED) {
                Tripwire.trip(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            }
            spliterator().forEachRemaining(consumer);
        }

        public long get(long j10) {
            int chunkFor = chunkFor(j10);
            return (this.spineIndex == 0 && chunkFor == 0) ? ((long[]) this.curChunk)[(int) j10] : ((long[][]) this.spine)[chunkFor][(int) (j10 - this.priorElementCount[chunkFor])];
        }

        @Override // java.lang.Iterable
        public PrimitiveIterator.OfLong iterator() {
            return Spliterators.iterator(spliterator());
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public long[] newArray(int i10) {
            return new long[i10];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.SpinedBuffer.OfPrimitive
        public long[][] newArrayArray(int i10) {
            return new long[i10];
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, java.lang.Iterable, j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        public Spliterator.OfLong spliterator() {
            return new C1Splitr(0, this.spineIndex, 0, this.elementIndex);
        }

        public String toString() {
            long[] jArr = (long[]) asPrimitiveArray();
            return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.spineIndex), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.spineIndex), Arrays.toString(Arrays.copyOf(jArr, (int) m.e.DEFAULT_DRAG_ANIMATION_DURATION)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class OfPrimitive extends AbstractSpinedBuffer implements Iterable {
        Object curChunk;
        Object[] spine;

        /* loaded from: classes2.dex */
        abstract class BaseSpliterator implements Spliterator.OfPrimitive {
            final int lastSpineElementFence;
            final int lastSpineIndex;
            Object splChunk;
            int splElementIndex;
            int splSpineIndex;

            BaseSpliterator(int i10, int i11, int i12, int i13) {
                this.splSpineIndex = i10;
                this.lastSpineIndex = i11;
                this.splElementIndex = i12;
                this.lastSpineElementFence = i13;
                Object[] objArr = OfPrimitive.this.spine;
                this.splChunk = objArr == null ? OfPrimitive.this.curChunk : objArr[i10];
            }

            abstract void arrayForOne(Object obj, int i10, Object obj2);

            abstract Spliterator.OfPrimitive arraySpliterator(Object obj, int i10, int i11);

            @Override // j$.util.Spliterator
            public int characteristics() {
                return 16464;
            }

            @Override // j$.util.Spliterator
            public long estimateSize() {
                int i10 = this.splSpineIndex;
                int i11 = this.lastSpineIndex;
                if (i10 == i11) {
                    return this.lastSpineElementFence - this.splElementIndex;
                }
                long[] jArr = OfPrimitive.this.priorElementCount;
                return ((jArr[i11] + this.lastSpineElementFence) - jArr[i10]) - this.splElementIndex;
            }

            @Override // j$.util.Spliterator.OfPrimitive
            public void forEachRemaining(Object obj) {
                int i10;
                Objects.requireNonNull(obj);
                int i11 = this.splSpineIndex;
                int i12 = this.lastSpineIndex;
                if (i11 < i12 || (i11 == i12 && this.splElementIndex < this.lastSpineElementFence)) {
                    int i13 = this.splElementIndex;
                    while (true) {
                        i10 = this.lastSpineIndex;
                        if (i11 >= i10) {
                            break;
                        }
                        OfPrimitive ofPrimitive = OfPrimitive.this;
                        Object obj2 = ofPrimitive.spine[i11];
                        ofPrimitive.arrayForEach(obj2, i13, ofPrimitive.arrayLength(obj2), obj);
                        i11++;
                        i13 = 0;
                    }
                    OfPrimitive.this.arrayForEach(this.splSpineIndex == i10 ? this.splChunk : OfPrimitive.this.spine[i10], i13, this.lastSpineElementFence, obj);
                    this.splSpineIndex = this.lastSpineIndex;
                    this.splElementIndex = this.lastSpineElementFence;
                }
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ Comparator getComparator() {
                return Spliterator.CC.$default$getComparator(this);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ long getExactSizeIfKnown() {
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean hasCharacteristics(int i10) {
                return Spliterator.CC.$default$hasCharacteristics(this, i10);
            }

            abstract Spliterator.OfPrimitive newSpliterator(int i10, int i11, int i12, int i13);

            @Override // j$.util.Spliterator.OfPrimitive
            public boolean tryAdvance(Object obj) {
                Objects.requireNonNull(obj);
                int i10 = this.splSpineIndex;
                int i11 = this.lastSpineIndex;
                if (i10 < i11 || (i10 == i11 && this.splElementIndex < this.lastSpineElementFence)) {
                    Object obj2 = this.splChunk;
                    int i12 = this.splElementIndex;
                    this.splElementIndex = i12 + 1;
                    arrayForOne(obj2, i12, obj);
                    if (this.splElementIndex == OfPrimitive.this.arrayLength(this.splChunk)) {
                        this.splElementIndex = 0;
                        int i13 = this.splSpineIndex + 1;
                        this.splSpineIndex = i13;
                        Object[] objArr = OfPrimitive.this.spine;
                        if (objArr != null && i13 <= this.lastSpineIndex) {
                            this.splChunk = objArr[i13];
                        }
                    }
                    return true;
                }
                return false;
            }

            @Override // j$.util.Spliterator
            public Spliterator.OfPrimitive trySplit() {
                int i10 = this.splSpineIndex;
                int i11 = this.lastSpineIndex;
                if (i10 < i11) {
                    int i12 = this.splElementIndex;
                    OfPrimitive ofPrimitive = OfPrimitive.this;
                    Spliterator.OfPrimitive newSpliterator = newSpliterator(i10, i11 - 1, i12, ofPrimitive.arrayLength(ofPrimitive.spine[i11 - 1]));
                    int i13 = this.lastSpineIndex;
                    this.splSpineIndex = i13;
                    this.splElementIndex = 0;
                    this.splChunk = OfPrimitive.this.spine[i13];
                    return newSpliterator;
                } else if (i10 == i11) {
                    int i14 = this.lastSpineElementFence;
                    int i15 = this.splElementIndex;
                    int i16 = (i14 - i15) / 2;
                    if (i16 == 0) {
                        return null;
                    }
                    Spliterator.OfPrimitive arraySpliterator = arraySpliterator(this.splChunk, i15, i16);
                    this.splElementIndex += i16;
                    return arraySpliterator;
                } else {
                    return null;
                }
            }
        }

        OfPrimitive() {
            this.curChunk = newArray(1 << this.initialChunkPower);
        }

        OfPrimitive(int i10) {
            super(i10);
            this.curChunk = newArray(1 << this.initialChunkPower);
        }

        private void inflateSpine() {
            if (this.spine == null) {
                Object[] newArrayArray = newArrayArray(8);
                this.spine = newArrayArray;
                this.priorElementCount = new long[8];
                newArrayArray[0] = this.curChunk;
            }
        }

        protected abstract void arrayForEach(Object obj, int i10, int i11, Object obj2);

        protected abstract int arrayLength(Object obj);

        public Object asPrimitiveArray() {
            long count = count();
            if (count < 2147483639) {
                Object newArray = newArray((int) count);
                copyInto(newArray, 0);
                return newArray;
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }

        protected long capacity() {
            int i10 = this.spineIndex;
            if (i10 == 0) {
                return arrayLength(this.curChunk);
            }
            return arrayLength(this.spine[i10]) + this.priorElementCount[i10];
        }

        protected int chunkFor(long j10) {
            if (this.spineIndex == 0) {
                if (j10 < this.elementIndex) {
                    return 0;
                }
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else if (j10 < count()) {
                for (int i10 = 0; i10 <= this.spineIndex; i10++) {
                    if (j10 < this.priorElementCount[i10] + arrayLength(this.spine[i10])) {
                        return i10;
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
        }

        @Override // j$.util.stream.AbstractSpinedBuffer
        public void clear() {
            Object[] objArr = this.spine;
            if (objArr != null) {
                this.curChunk = objArr[0];
                this.spine = null;
                this.priorElementCount = null;
            }
            this.elementIndex = 0;
            this.spineIndex = 0;
        }

        public void copyInto(Object obj, int i10) {
            long j10 = i10;
            long count = count() + j10;
            if (count > arrayLength(obj) || count < j10) {
                throw new IndexOutOfBoundsException("does not fit");
            }
            if (this.spineIndex == 0) {
                System.arraycopy(this.curChunk, 0, obj, i10, this.elementIndex);
                return;
            }
            for (int i11 = 0; i11 < this.spineIndex; i11++) {
                Object obj2 = this.spine[i11];
                System.arraycopy(obj2, 0, obj, i10, arrayLength(obj2));
                i10 += arrayLength(this.spine[i11]);
            }
            int i12 = this.elementIndex;
            if (i12 > 0) {
                System.arraycopy(this.curChunk, 0, obj, i10, i12);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void ensureCapacity(long j10) {
            long capacity = capacity();
            if (j10 <= capacity) {
                return;
            }
            inflateSpine();
            int i10 = this.spineIndex;
            while (true) {
                i10++;
                if (j10 <= capacity) {
                    return;
                }
                Object[] objArr = this.spine;
                if (i10 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.spine = Arrays.copyOf(objArr, length);
                    this.priorElementCount = Arrays.copyOf(this.priorElementCount, length);
                }
                int chunkSize = chunkSize(i10);
                this.spine[i10] = newArray(chunkSize);
                long[] jArr = this.priorElementCount;
                jArr[i10] = jArr[i10 - 1] + arrayLength(this.spine[r5]);
                capacity += chunkSize;
            }
        }

        public void forEach(Object obj) {
            for (int i10 = 0; i10 < this.spineIndex; i10++) {
                Object obj2 = this.spine[i10];
                arrayForEach(obj2, 0, arrayLength(obj2), obj);
            }
            arrayForEach(this.curChunk, 0, this.elementIndex, obj);
        }

        protected void increaseCapacity() {
            ensureCapacity(capacity() + 1);
        }

        public abstract Object newArray(int i10);

        protected abstract Object[] newArrayArray(int i10);

        protected void preAccept() {
            if (this.elementIndex == arrayLength(this.curChunk)) {
                inflateSpine();
                int i10 = this.spineIndex;
                int i11 = i10 + 1;
                Object[] objArr = this.spine;
                if (i11 >= objArr.length || objArr[i10 + 1] == null) {
                    increaseCapacity();
                }
                this.elementIndex = 0;
                int i12 = this.spineIndex + 1;
                this.spineIndex = i12;
                this.curChunk = this.spine[i12];
            }
        }

        public abstract Spliterator spliterator();

        @Override // java.lang.Iterable
        public /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }
    }

    private void inflateSpine() {
        if (this.spine == null) {
            Object[][] objArr = new Object[8];
            this.spine = objArr;
            this.priorElementCount = new long[8];
            objArr[0] = this.curChunk;
        }
    }

    public void accept(Object obj) {
        if (this.elementIndex == this.curChunk.length) {
            inflateSpine();
            int i10 = this.spineIndex;
            int i11 = i10 + 1;
            Object[][] objArr = this.spine;
            if (i11 >= objArr.length || objArr[i10 + 1] == null) {
                increaseCapacity();
            }
            this.elementIndex = 0;
            int i12 = this.spineIndex + 1;
            this.spineIndex = i12;
            this.curChunk = this.spine[i12];
        }
        Object[] objArr2 = this.curChunk;
        int i13 = this.elementIndex;
        this.elementIndex = i13 + 1;
        objArr2[i13] = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public Object[] asArray(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            copyInto(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    protected long capacity() {
        int i10 = this.spineIndex;
        if (i10 == 0) {
            return this.curChunk.length;
        }
        return this.spine[i10].length + this.priorElementCount[i10];
    }

    @Override // j$.util.stream.AbstractSpinedBuffer
    public void clear() {
        Object[][] objArr = this.spine;
        if (objArr != null) {
            this.curChunk = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.curChunk;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.spine = null;
            this.priorElementCount = null;
        } else {
            for (int i11 = 0; i11 < this.elementIndex; i11++) {
                this.curChunk[i11] = null;
            }
        }
        this.elementIndex = 0;
        this.spineIndex = 0;
    }

    public void copyInto(Object[] objArr, int i10) {
        long j10 = i10;
        long count = count() + j10;
        if (count > objArr.length || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.spineIndex == 0) {
            System.arraycopy(this.curChunk, 0, objArr, i10, this.elementIndex);
            return;
        }
        for (int i11 = 0; i11 < this.spineIndex; i11++) {
            Object[] objArr2 = this.spine[i11];
            System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
            i10 += this.spine[i11].length;
        }
        int i12 = this.elementIndex;
        if (i12 > 0) {
            System.arraycopy(this.curChunk, 0, objArr, i10, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ensureCapacity(long j10) {
        long capacity = capacity();
        if (j10 <= capacity) {
            return;
        }
        inflateSpine();
        int i10 = this.spineIndex;
        while (true) {
            i10++;
            if (j10 <= capacity) {
                return;
            }
            Object[][] objArr = this.spine;
            if (i10 >= objArr.length) {
                int length = objArr.length * 2;
                this.spine = (Object[][]) Arrays.copyOf(objArr, length);
                this.priorElementCount = Arrays.copyOf(this.priorElementCount, length);
            }
            int chunkSize = chunkSize(i10);
            this.spine[i10] = new Object[chunkSize];
            long[] jArr = this.priorElementCount;
            jArr[i10] = jArr[i10 - 1] + r4[r6].length;
            capacity += chunkSize;
        }
    }

    public void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.spineIndex; i10++) {
            for (Object obj : this.spine[i10]) {
                consumer.accept(obj);
            }
        }
        for (int i11 = 0; i11 < this.elementIndex; i11++) {
            consumer.accept(this.curChunk[i11]);
        }
    }

    public Object get(long j10) {
        if (this.spineIndex == 0) {
            if (j10 < this.elementIndex) {
                return this.curChunk[(int) j10];
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else if (j10 < count()) {
            for (int i10 = 0; i10 <= this.spineIndex; i10++) {
                long j11 = this.priorElementCount[i10];
                Object[] objArr = this.spine[i10];
                if (j10 < objArr.length + j11) {
                    return objArr[(int) (j10 - j11)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
    }

    protected void increaseCapacity() {
        ensureCapacity(capacity() + 1);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Spliterators.iterator(spliterator());
    }

    public Spliterator spliterator() {
        return new C1Splitr(0, this.spineIndex, 0, this.elementIndex);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public String toString() {
        final ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new Consumer() { // from class: j$.util.stream.SpinedBuffer$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add(obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return "SpinedBuffer:" + arrayList.toString();
    }
}
