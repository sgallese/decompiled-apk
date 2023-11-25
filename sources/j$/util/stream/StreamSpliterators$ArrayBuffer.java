package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
abstract class StreamSpliterators$ArrayBuffer {
    int index;

    /* loaded from: classes2.dex */
    static final class OfDouble extends OfPrimitive implements DoubleConsumer {
        final double[] array;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfDouble(int i10) {
            this.array = new double[i10];
        }

        @Override // java.util.function.DoubleConsumer
        public void accept(double d10) {
            double[] dArr = this.array;
            int i10 = ((OfPrimitive) this).index;
            ((OfPrimitive) this).index = i10 + 1;
            dArr[i10] = d10;
        }

        public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
            return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.util.stream.StreamSpliterators$ArrayBuffer.OfPrimitive
        public void forEach(DoubleConsumer doubleConsumer, long j10) {
            for (int i10 = 0; i10 < j10; i10++) {
                doubleConsumer.accept(this.array[i10]);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class OfInt extends OfPrimitive implements IntConsumer {
        final int[] array;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt(int i10) {
            this.array = new int[i10];
        }

        @Override // java.util.function.IntConsumer
        public void accept(int i10) {
            int[] iArr = this.array;
            int i11 = ((OfPrimitive) this).index;
            ((OfPrimitive) this).index = i11 + 1;
            iArr[i11] = i10;
        }

        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
            return IntConsumer$CC.$default$andThen(this, intConsumer);
        }

        @Override // j$.util.stream.StreamSpliterators$ArrayBuffer.OfPrimitive
        public void forEach(IntConsumer intConsumer, long j10) {
            for (int i10 = 0; i10 < j10; i10++) {
                intConsumer.accept(this.array[i10]);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class OfLong extends OfPrimitive implements LongConsumer {
        final long[] array;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong(int i10) {
            this.array = new long[i10];
        }

        @Override // java.util.function.LongConsumer
        public void accept(long j10) {
            long[] jArr = this.array;
            int i10 = ((OfPrimitive) this).index;
            ((OfPrimitive) this).index = i10 + 1;
            jArr[i10] = j10;
        }

        public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
            return LongConsumer$CC.$default$andThen(this, longConsumer);
        }

        @Override // j$.util.stream.StreamSpliterators$ArrayBuffer.OfPrimitive
        public void forEach(LongConsumer longConsumer, long j10) {
            for (int i10 = 0; i10 < j10; i10++) {
                longConsumer.accept(this.array[i10]);
            }
        }
    }

    /* loaded from: classes2.dex */
    static abstract class OfPrimitive extends StreamSpliterators$ArrayBuffer {
        int index;

        OfPrimitive() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void forEach(Object obj, long j10);

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.util.stream.StreamSpliterators$ArrayBuffer
        public void reset() {
            this.index = 0;
        }
    }

    /* loaded from: classes2.dex */
    static final class OfRef extends StreamSpliterators$ArrayBuffer implements Consumer {
        final Object[] array;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfRef(int i10) {
            this.array = new Object[i10];
        }

        @Override // java.util.function.Consumer
        public void accept(Object obj) {
            Object[] objArr = this.array;
            int i10 = this.index;
            this.index = i10 + 1;
            objArr[i10] = obj;
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        public void forEach(Consumer consumer, long j10) {
            for (int i10 = 0; i10 < j10; i10++) {
                consumer.accept(this.array[i10]);
            }
        }
    }

    StreamSpliterators$ArrayBuffer() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reset() {
        this.index = 0;
    }
}
