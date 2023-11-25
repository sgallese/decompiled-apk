package j$.util;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j$.util.Iterator;
import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public abstract class Spliterators {
    private static final Spliterator EMPTY_SPLITERATOR = new EmptySpliterator.OfRef();
    private static final Spliterator.OfInt EMPTY_INT_SPLITERATOR = new EmptySpliterator.OfInt();
    private static final Spliterator.OfLong EMPTY_LONG_SPLITERATOR = new EmptySpliterator.OfLong();
    private static final Spliterator.OfDouble EMPTY_DOUBLE_SPLITERATOR = new EmptySpliterator.OfDouble();

    /* renamed from: j$.util.Spliterators$1Adapter  reason: invalid class name */
    /* loaded from: classes2.dex */
    class C1Adapter implements java.util.Iterator, Consumer {
        Object nextElement;
        final /* synthetic */ Spliterator val$spliterator;
        boolean valueReady = false;

        C1Adapter(Spliterator spliterator) {
            this.val$spliterator = spliterator;
        }

        @Override // java.util.function.Consumer
        public void accept(Object obj) {
            this.valueReady = true;
            this.nextElement = obj;
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.valueReady) {
                this.val$spliterator.tryAdvance(this);
            }
            return this.valueReady;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.valueReady || hasNext()) {
                this.valueReady = false;
                return this.nextElement;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: j$.util.Spliterators$2Adapter  reason: invalid class name */
    /* loaded from: classes2.dex */
    class C2Adapter implements PrimitiveIterator.OfInt, IntConsumer, Iterator {
        int nextElement;
        final /* synthetic */ Spliterator.OfInt val$spliterator;
        boolean valueReady = false;

        C2Adapter(Spliterator.OfInt ofInt) {
            this.val$spliterator = ofInt;
        }

        @Override // java.util.function.IntConsumer
        public void accept(int i10) {
            this.valueReady = true;
            this.nextElement = i10;
        }

        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
            return IntConsumer$CC.$default$andThen(this, intConsumer);
        }

        @Override // j$.util.PrimitiveIterator
        public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
            forEachRemaining((IntConsumer) obj);
        }

        @Override // j$.util.PrimitiveIterator.OfInt, java.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            PrimitiveIterator.OfInt.CC.$default$forEachRemaining((PrimitiveIterator.OfInt) this, consumer);
        }

        @Override // j$.util.PrimitiveIterator.OfInt
        public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
            PrimitiveIterator.OfInt.CC.$default$forEachRemaining((PrimitiveIterator.OfInt) this, intConsumer);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.valueReady) {
                this.val$spliterator.tryAdvance((IntConsumer) this);
            }
            return this.valueReady;
        }

        @Override // j$.util.PrimitiveIterator.OfInt, java.util.Iterator
        public /* synthetic */ Integer next() {
            return PrimitiveIterator.OfInt.CC.$default$next((PrimitiveIterator.OfInt) this);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            Object next;
            next = next();
            return next;
        }

        @Override // j$.util.PrimitiveIterator.OfInt
        public int nextInt() {
            if (this.valueReady || hasNext()) {
                this.valueReady = false;
                return this.nextElement;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: j$.util.Spliterators$3Adapter  reason: invalid class name */
    /* loaded from: classes2.dex */
    class C3Adapter implements PrimitiveIterator.OfLong, LongConsumer, Iterator {
        long nextElement;
        final /* synthetic */ Spliterator.OfLong val$spliterator;
        boolean valueReady = false;

        C3Adapter(Spliterator.OfLong ofLong) {
            this.val$spliterator = ofLong;
        }

        @Override // java.util.function.LongConsumer
        public void accept(long j10) {
            this.valueReady = true;
            this.nextElement = j10;
        }

        public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
            return LongConsumer$CC.$default$andThen(this, longConsumer);
        }

        @Override // j$.util.PrimitiveIterator
        public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
            forEachRemaining((LongConsumer) obj);
        }

        @Override // j$.util.PrimitiveIterator.OfLong, java.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            PrimitiveIterator.OfLong.CC.$default$forEachRemaining((PrimitiveIterator.OfLong) this, consumer);
        }

        @Override // j$.util.PrimitiveIterator.OfLong
        public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
            PrimitiveIterator.OfLong.CC.$default$forEachRemaining((PrimitiveIterator.OfLong) this, longConsumer);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.valueReady) {
                this.val$spliterator.tryAdvance((LongConsumer) this);
            }
            return this.valueReady;
        }

        @Override // j$.util.PrimitiveIterator.OfLong, java.util.Iterator
        public /* synthetic */ Long next() {
            return PrimitiveIterator.OfLong.CC.$default$next((PrimitiveIterator.OfLong) this);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            Object next;
            next = next();
            return next;
        }

        @Override // j$.util.PrimitiveIterator.OfLong
        public long nextLong() {
            if (this.valueReady || hasNext()) {
                this.valueReady = false;
                return this.nextElement;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: j$.util.Spliterators$4Adapter  reason: invalid class name */
    /* loaded from: classes2.dex */
    class C4Adapter implements PrimitiveIterator.OfDouble, DoubleConsumer, Iterator {
        double nextElement;
        final /* synthetic */ Spliterator.OfDouble val$spliterator;
        boolean valueReady = false;

        C4Adapter(Spliterator.OfDouble ofDouble) {
            this.val$spliterator = ofDouble;
        }

        @Override // java.util.function.DoubleConsumer
        public void accept(double d10) {
            this.valueReady = true;
            this.nextElement = d10;
        }

        public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
            return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
        }

        @Override // j$.util.PrimitiveIterator
        public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
            forEachRemaining((DoubleConsumer) obj);
        }

        @Override // j$.util.PrimitiveIterator.OfDouble, java.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            PrimitiveIterator.OfDouble.CC.$default$forEachRemaining((PrimitiveIterator.OfDouble) this, consumer);
        }

        @Override // j$.util.PrimitiveIterator.OfDouble
        public /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
            PrimitiveIterator.OfDouble.CC.$default$forEachRemaining((PrimitiveIterator.OfDouble) this, doubleConsumer);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.valueReady) {
                this.val$spliterator.tryAdvance((DoubleConsumer) this);
            }
            return this.valueReady;
        }

        @Override // j$.util.PrimitiveIterator.OfDouble, java.util.Iterator
        public /* synthetic */ Double next() {
            return PrimitiveIterator.OfDouble.CC.$default$next((PrimitiveIterator.OfDouble) this);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            Object next;
            next = next();
            return next;
        }

        @Override // j$.util.PrimitiveIterator.OfDouble
        public double nextDouble() {
            if (this.valueReady || hasNext()) {
                this.valueReady = false;
                return this.nextElement;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes2.dex */
    static final class ArraySpliterator implements Spliterator {
        private final Object[] array;
        private final int characteristics;
        private final int fence;
        private int index;

        public ArraySpliterator(Object[] objArr, int i10, int i11, int i12) {
            this.array = objArr;
            this.index = i10;
            this.fence = i11;
            this.characteristics = i12 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.characteristics;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.fence - this.index;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            int i10;
            consumer.getClass();
            Object[] objArr = this.array;
            int length = objArr.length;
            int i11 = this.fence;
            if (length < i11 || (i10 = this.index) < 0) {
                return;
            }
            this.index = i11;
            if (i10 >= i11) {
                return;
            }
            do {
                consumer.accept(objArr[i10]);
                i10++;
            } while (i10 < i11);
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
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
            consumer.getClass();
            int i10 = this.index;
            if (i10 < 0 || i10 >= this.fence) {
                return false;
            }
            Object[] objArr = this.array;
            this.index = i10 + 1;
            consumer.accept(objArr[i10]);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i10 = this.index;
            int i11 = (this.fence + i10) >>> 1;
            if (i10 >= i11) {
                return null;
            }
            Object[] objArr = this.array;
            this.index = i11;
            return new ArraySpliterator(objArr, i10, i11, this.characteristics);
        }
    }

    /* loaded from: classes2.dex */
    static final class DoubleArraySpliterator implements Spliterator.OfDouble {
        private final double[] array;
        private final int characteristics;
        private final int fence;
        private int index;

        public DoubleArraySpliterator(double[] dArr, int i10, int i11, int i12) {
            this.array = dArr;
            this.index = i10;
            this.fence = i11;
            this.characteristics = i12 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.characteristics;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.fence - this.index;
        }

        @Override // j$.util.Spliterator.OfDouble, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfDouble.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            int i10;
            doubleConsumer.getClass();
            double[] dArr = this.array;
            int length = dArr.length;
            int i11 = this.fence;
            if (length < i11 || (i10 = this.index) < 0) {
                return;
            }
            this.index = i11;
            if (i10 >= i11) {
                return;
            }
            do {
                doubleConsumer.accept(dArr[i10]);
                i10++;
            } while (i10 < i11);
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i10) {
            return Spliterator.CC.$default$hasCharacteristics(this, i10);
        }

        @Override // j$.util.Spliterator.OfDouble, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(DoubleConsumer doubleConsumer) {
            doubleConsumer.getClass();
            int i10 = this.index;
            if (i10 < 0 || i10 >= this.fence) {
                return false;
            }
            double[] dArr = this.array;
            this.index = i10 + 1;
            doubleConsumer.accept(dArr[i10]);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator.OfDouble trySplit() {
            int i10 = this.index;
            int i11 = (this.fence + i10) >>> 1;
            if (i10 >= i11) {
                return null;
            }
            double[] dArr = this.array;
            this.index = i11;
            return new DoubleArraySpliterator(dArr, i10, i11, this.characteristics);
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class EmptySpliterator {

        /* loaded from: classes2.dex */
        private static final class OfDouble extends EmptySpliterator implements Spliterator.OfDouble {
            OfDouble() {
            }

            @Override // j$.util.Spliterator.OfDouble, j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfDouble.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator.OfDouble
            public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
                super.forEachRemaining((Object) doubleConsumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ java.util.Comparator getComparator() {
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

            @Override // j$.util.Spliterator.OfDouble, j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfDouble
            public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
                return super.tryAdvance((Object) doubleConsumer);
            }

            @Override // j$.util.Spliterators.EmptySpliterator, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
                return (Spliterator.OfDouble) super.trySplit();
            }

            @Override // j$.util.Spliterators.EmptySpliterator, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
                return (Spliterator.OfPrimitive) super.trySplit();
            }
        }

        /* loaded from: classes2.dex */
        private static final class OfInt extends EmptySpliterator implements Spliterator.OfInt {
            OfInt() {
            }

            @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator.OfInt
            public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
                super.forEachRemaining((Object) intConsumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ java.util.Comparator getComparator() {
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

            @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfInt
            public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
                return super.tryAdvance((Object) intConsumer);
            }

            @Override // j$.util.Spliterators.EmptySpliterator, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
                return (Spliterator.OfInt) super.trySplit();
            }

            @Override // j$.util.Spliterators.EmptySpliterator, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
                return (Spliterator.OfPrimitive) super.trySplit();
            }
        }

        /* loaded from: classes2.dex */
        private static final class OfLong extends EmptySpliterator implements Spliterator.OfLong {
            OfLong() {
            }

            @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfLong.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator.OfLong
            public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
                super.forEachRemaining((Object) longConsumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ java.util.Comparator getComparator() {
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

            @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfLong.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfLong
            public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
                return super.tryAdvance((Object) longConsumer);
            }

            @Override // j$.util.Spliterators.EmptySpliterator, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
                return (Spliterator.OfLong) super.trySplit();
            }

            @Override // j$.util.Spliterators.EmptySpliterator, j$.util.Spliterator.OfDouble, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
                return (Spliterator.OfPrimitive) super.trySplit();
            }
        }

        /* loaded from: classes2.dex */
        private static final class OfRef extends EmptySpliterator implements Spliterator {
            OfRef() {
            }

            @Override // j$.util.Spliterator
            public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
                super.forEachRemaining((Object) consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ java.util.Comparator getComparator() {
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
            public /* bridge */ /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return super.tryAdvance((Object) consumer);
            }
        }

        EmptySpliterator() {
        }

        public int characteristics() {
            return 16448;
        }

        public long estimateSize() {
            return 0L;
        }

        public void forEachRemaining(Object obj) {
            Objects.requireNonNull(obj);
        }

        public boolean tryAdvance(Object obj) {
            Objects.requireNonNull(obj);
            return false;
        }

        public Spliterator trySplit() {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static final class IntArraySpliterator implements Spliterator.OfInt {
        private final int[] array;
        private final int characteristics;
        private final int fence;
        private int index;

        public IntArraySpliterator(int[] iArr, int i10, int i11, int i12) {
            this.array = iArr;
            this.index = i10;
            this.fence = i11;
            this.characteristics = i12 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.characteristics;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.fence - this.index;
        }

        @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(IntConsumer intConsumer) {
            int i10;
            intConsumer.getClass();
            int[] iArr = this.array;
            int length = iArr.length;
            int i11 = this.fence;
            if (length < i11 || (i10 = this.index) < 0) {
                return;
            }
            this.index = i11;
            if (i10 >= i11) {
                return;
            }
            do {
                intConsumer.accept(iArr[i10]);
                i10++;
            } while (i10 < i11);
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i10) {
            return Spliterator.CC.$default$hasCharacteristics(this, i10);
        }

        @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(IntConsumer intConsumer) {
            intConsumer.getClass();
            int i10 = this.index;
            if (i10 < 0 || i10 >= this.fence) {
                return false;
            }
            int[] iArr = this.array;
            this.index = i10 + 1;
            intConsumer.accept(iArr[i10]);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator.OfInt trySplit() {
            int i10 = this.index;
            int i11 = (this.fence + i10) >>> 1;
            if (i10 >= i11) {
                return null;
            }
            int[] iArr = this.array;
            this.index = i11;
            return new IntArraySpliterator(iArr, i10, i11, this.characteristics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class IteratorSpliterator implements Spliterator {
        private int batch;
        private final int characteristics;
        private final java.util.Collection collection;
        private long est;
        private java.util.Iterator it = null;

        public IteratorSpliterator(java.util.Collection collection, int i10) {
            this.collection = collection;
            this.characteristics = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? i10 | 64 | Http2.INITIAL_MAX_FRAME_SIZE : i10;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.characteristics;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            if (this.it == null) {
                this.it = this.collection.iterator();
                long size = this.collection.size();
                this.est = size;
                return size;
            }
            return this.est;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            java.util.Iterator it = this.it;
            if (it == null) {
                it = this.collection.iterator();
                this.it = it;
                this.est = this.collection.size();
            }
            Iterator.EL.forEachRemaining(it, consumer);
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
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
            consumer.getClass();
            if (this.it == null) {
                this.it = this.collection.iterator();
                this.est = this.collection.size();
            }
            if (this.it.hasNext()) {
                consumer.accept(this.it.next());
                return true;
            }
            return false;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            long j10;
            java.util.Iterator it = this.it;
            if (it == null) {
                it = this.collection.iterator();
                this.it = it;
                j10 = this.collection.size();
                this.est = j10;
            } else {
                j10 = this.est;
            }
            if (j10 <= 1 || !it.hasNext()) {
                return null;
            }
            int i10 = this.batch + UserVerificationMethods.USER_VERIFY_ALL;
            if (i10 > j10) {
                i10 = (int) j10;
            }
            if (i10 > 33554432) {
                i10 = 33554432;
            }
            Object[] objArr = new Object[i10];
            int i11 = 0;
            do {
                objArr[i11] = it.next();
                i11++;
                if (i11 >= i10) {
                    break;
                }
            } while (it.hasNext());
            this.batch = i11;
            long j11 = this.est;
            if (j11 != Long.MAX_VALUE) {
                this.est = j11 - i11;
            }
            return new ArraySpliterator(objArr, 0, i11, this.characteristics);
        }
    }

    /* loaded from: classes2.dex */
    static final class LongArraySpliterator implements Spliterator.OfLong {
        private final long[] array;
        private final int characteristics;
        private final int fence;
        private int index;

        public LongArraySpliterator(long[] jArr, int i10, int i11, int i12) {
            this.array = jArr;
            this.index = i10;
            this.fence = i11;
            this.characteristics = i12 | 64 | Http2.INITIAL_MAX_FRAME_SIZE;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.characteristics;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.fence - this.index;
        }

        @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfLong.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(LongConsumer longConsumer) {
            int i10;
            longConsumer.getClass();
            long[] jArr = this.array;
            int length = jArr.length;
            int i11 = this.fence;
            if (length < i11 || (i10 = this.index) < 0) {
                return;
            }
            this.index = i11;
            if (i10 >= i11) {
                return;
            }
            do {
                longConsumer.accept(jArr[i10]);
                i10++;
            } while (i10 < i11);
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (hasCharacteristics(4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i10) {
            return Spliterator.CC.$default$hasCharacteristics(this, i10);
        }

        @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfLong.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(LongConsumer longConsumer) {
            longConsumer.getClass();
            int i10 = this.index;
            if (i10 < 0 || i10 >= this.fence) {
                return false;
            }
            long[] jArr = this.array;
            this.index = i10 + 1;
            longConsumer.accept(jArr[i10]);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator.OfLong trySplit() {
            int i10 = this.index;
            int i11 = (this.fence + i10) >>> 1;
            if (i10 >= i11) {
                return null;
            }
            long[] jArr = this.array;
            this.index = i11;
            return new LongArraySpliterator(jArr, i10, i11, this.characteristics);
        }
    }

    private static void checkFromToBounds(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
    }

    public static Spliterator.OfDouble emptyDoubleSpliterator() {
        return EMPTY_DOUBLE_SPLITERATOR;
    }

    public static Spliterator.OfInt emptyIntSpliterator() {
        return EMPTY_INT_SPLITERATOR;
    }

    public static Spliterator.OfLong emptyLongSpliterator() {
        return EMPTY_LONG_SPLITERATOR;
    }

    public static Spliterator emptySpliterator() {
        return EMPTY_SPLITERATOR;
    }

    public static PrimitiveIterator.OfDouble iterator(Spliterator.OfDouble ofDouble) {
        Objects.requireNonNull(ofDouble);
        return new C4Adapter(ofDouble);
    }

    public static PrimitiveIterator.OfInt iterator(Spliterator.OfInt ofInt) {
        Objects.requireNonNull(ofInt);
        return new C2Adapter(ofInt);
    }

    public static PrimitiveIterator.OfLong iterator(Spliterator.OfLong ofLong) {
        Objects.requireNonNull(ofLong);
        return new C3Adapter(ofLong);
    }

    public static java.util.Iterator iterator(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new C1Adapter(spliterator);
    }

    public static Spliterator.OfDouble spliterator(double[] dArr, int i10, int i11, int i12) {
        checkFromToBounds(((double[]) Objects.requireNonNull(dArr)).length, i10, i11);
        return new DoubleArraySpliterator(dArr, i10, i11, i12);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i10, int i11, int i12) {
        checkFromToBounds(((int[]) Objects.requireNonNull(iArr)).length, i10, i11);
        return new IntArraySpliterator(iArr, i10, i11, i12);
    }

    public static Spliterator.OfLong spliterator(long[] jArr, int i10, int i11, int i12) {
        checkFromToBounds(((long[]) Objects.requireNonNull(jArr)).length, i10, i11);
        return new LongArraySpliterator(jArr, i10, i11, i12);
    }

    public static Spliterator spliterator(java.util.Collection collection, int i10) {
        return new IteratorSpliterator((java.util.Collection) Objects.requireNonNull(collection), i10);
    }

    public static Spliterator spliterator(Object[] objArr, int i10, int i11, int i12) {
        checkFromToBounds(((Object[]) Objects.requireNonNull(objArr)).length, i10, i11);
        return new ArraySpliterator(objArr, i10, i11, i12);
    }
}
