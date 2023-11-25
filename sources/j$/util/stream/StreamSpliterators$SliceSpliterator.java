package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.function.LongConsumer$CC;
import j$.util.stream.StreamSpliterators$SliceSpliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class StreamSpliterators$SliceSpliterator {
    long fence;
    long index;

    /* renamed from: s  reason: collision with root package name */
    Spliterator f18487s;
    final long sliceFence;
    final long sliceOrigin;

    /* loaded from: classes2.dex */
    static final class OfDouble extends OfPrimitive implements Spliterator.OfDouble {
        /* JADX INFO: Access modifiers changed from: package-private */
        public OfDouble(Spliterator.OfDouble ofDouble, long j10, long j11) {
            super(ofDouble, j10, j11);
        }

        OfDouble(Spliterator.OfDouble ofDouble, long j10, long j11, long j12, long j13) {
            super(ofDouble, j10, j11, j12, j13);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$emptyConsumer$0(double d10) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive
        public DoubleConsumer emptyConsumer() {
            return new DoubleConsumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfDouble$$ExternalSyntheticLambda0
                @Override // java.util.function.DoubleConsumer
                public final void accept(double d10) {
                    StreamSpliterators$SliceSpliterator.OfDouble.lambda$emptyConsumer$0(d10);
                }

                public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
                    return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
                }
            };
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfDouble.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfDouble
        public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
            super.forEachRemaining((Object) doubleConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator
        public Spliterator.OfDouble makeSpliterator(Spliterator.OfDouble ofDouble, long j10, long j11, long j12, long j13) {
            return new OfDouble(ofDouble, j10, j11, j12, j13);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfDouble
        public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
            return super.tryAdvance((Object) doubleConsumer);
        }

        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive, j$.util.stream.StreamSpliterators$SliceSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
            return (Spliterator.OfDouble) super.trySplit();
        }
    }

    /* loaded from: classes2.dex */
    static final class OfInt extends OfPrimitive implements Spliterator.OfInt {
        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt(Spliterator.OfInt ofInt, long j10, long j11) {
            super(ofInt, j10, j11);
        }

        OfInt(Spliterator.OfInt ofInt, long j10, long j11, long j12, long j13) {
            super(ofInt, j10, j11, j12, j13);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$emptyConsumer$0(int i10) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive
        public IntConsumer emptyConsumer() {
            return new IntConsumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfInt$$ExternalSyntheticLambda0
                @Override // java.util.function.IntConsumer
                public final void accept(int i10) {
                    StreamSpliterators$SliceSpliterator.OfInt.lambda$emptyConsumer$0(i10);
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            };
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
            super.forEachRemaining((Object) intConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator
        public Spliterator.OfInt makeSpliterator(Spliterator.OfInt ofInt, long j10, long j11, long j12, long j13) {
            return new OfInt(ofInt, j10, j11, j12, j13);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
            return super.tryAdvance((Object) intConsumer);
        }

        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive, j$.util.stream.StreamSpliterators$SliceSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
            return (Spliterator.OfInt) super.trySplit();
        }
    }

    /* loaded from: classes2.dex */
    static final class OfLong extends OfPrimitive implements Spliterator.OfLong {
        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong(Spliterator.OfLong ofLong, long j10, long j11) {
            super(ofLong, j10, j11);
        }

        OfLong(Spliterator.OfLong ofLong, long j10, long j11, long j12, long j13) {
            super(ofLong, j10, j11, j12, j13);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$emptyConsumer$0(long j10) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive
        public LongConsumer emptyConsumer() {
            return new LongConsumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfLong$$ExternalSyntheticLambda0
                @Override // java.util.function.LongConsumer
                public final void accept(long j10) {
                    StreamSpliterators$SliceSpliterator.OfLong.lambda$emptyConsumer$0(j10);
                }

                public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
                    return LongConsumer$CC.$default$andThen(this, longConsumer);
                }
            };
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.OfLong.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
            super.forEachRemaining((Object) longConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator
        public Spliterator.OfLong makeSpliterator(Spliterator.OfLong ofLong, long j10, long j11, long j12, long j13) {
            return new OfLong(ofLong, j10, j11, j12, j13);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfLong.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
            return super.tryAdvance((Object) longConsumer);
        }

        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator.OfPrimitive, j$.util.stream.StreamSpliterators$SliceSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
            return (Spliterator.OfLong) super.trySplit();
        }
    }

    /* loaded from: classes2.dex */
    static abstract class OfPrimitive extends StreamSpliterators$SliceSpliterator implements Spliterator.OfPrimitive {
        OfPrimitive(Spliterator.OfPrimitive ofPrimitive, long j10, long j11) {
            this(ofPrimitive, j10, j11, 0L, Math.min(ofPrimitive.estimateSize(), j11));
        }

        private OfPrimitive(Spliterator.OfPrimitive ofPrimitive, long j10, long j11, long j12, long j13) {
            super(ofPrimitive, j10, j11, j12, j13);
        }

        protected abstract Object emptyConsumer();

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(Object obj) {
            Objects.requireNonNull(obj);
            long j10 = this.sliceOrigin;
            long j11 = this.fence;
            if (j10 >= j11) {
                return;
            }
            long j12 = this.index;
            if (j12 >= j11) {
                return;
            }
            if (j12 >= j10 && j12 + ((Spliterator.OfPrimitive) this.f18487s).estimateSize() <= this.sliceFence) {
                ((Spliterator.OfPrimitive) this.f18487s).forEachRemaining(obj);
                this.index = this.fence;
                return;
            }
            while (this.sliceOrigin > this.index) {
                ((Spliterator.OfPrimitive) this.f18487s).tryAdvance(emptyConsumer());
                this.index++;
            }
            while (this.index < this.fence) {
                ((Spliterator.OfPrimitive) this.f18487s).tryAdvance(obj);
                this.index++;
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

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(Object obj) {
            long j10;
            Objects.requireNonNull(obj);
            if (this.sliceOrigin >= this.fence) {
                return false;
            }
            while (true) {
                long j11 = this.sliceOrigin;
                j10 = this.index;
                if (j11 <= j10) {
                    break;
                }
                ((Spliterator.OfPrimitive) this.f18487s).tryAdvance(emptyConsumer());
                this.index++;
            }
            if (j10 >= this.fence) {
                return false;
            }
            this.index = j10 + 1;
            return ((Spliterator.OfPrimitive) this.f18487s).tryAdvance(obj);
        }

        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
            return (Spliterator.OfPrimitive) super.trySplit();
        }
    }

    /* loaded from: classes2.dex */
    static final class OfRef extends StreamSpliterators$SliceSpliterator implements Spliterator {
        /* JADX INFO: Access modifiers changed from: package-private */
        public OfRef(Spliterator spliterator, long j10, long j11) {
            this(spliterator, j10, j11, 0L, Math.min(spliterator.estimateSize(), j11));
        }

        private OfRef(Spliterator spliterator, long j10, long j11, long j12, long j13) {
            super(spliterator, j10, j11, j12, j13);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$forEachRemaining$1(Object obj) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$tryAdvance$0(Object obj) {
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            Objects.requireNonNull(consumer);
            long j10 = this.sliceOrigin;
            long j11 = this.fence;
            if (j10 >= j11) {
                return;
            }
            long j12 = this.index;
            if (j12 >= j11) {
                return;
            }
            if (j12 >= j10 && j12 + this.f18487s.estimateSize() <= this.sliceFence) {
                this.f18487s.forEachRemaining(consumer);
                this.index = this.fence;
                return;
            }
            while (this.sliceOrigin > this.index) {
                this.f18487s.tryAdvance(new Consumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        StreamSpliterators$SliceSpliterator.OfRef.lambda$forEachRemaining$1(obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                this.index++;
            }
            while (this.index < this.fence) {
                this.f18487s.tryAdvance(consumer);
                this.index++;
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

        @Override // j$.util.stream.StreamSpliterators$SliceSpliterator
        protected Spliterator makeSpliterator(Spliterator spliterator, long j10, long j11, long j12, long j13) {
            return new OfRef(spliterator, j10, j11, j12, j13);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            long j10;
            Objects.requireNonNull(consumer);
            if (this.sliceOrigin >= this.fence) {
                return false;
            }
            while (true) {
                long j11 = this.sliceOrigin;
                j10 = this.index;
                if (j11 <= j10) {
                    break;
                }
                this.f18487s.tryAdvance(new Consumer() { // from class: j$.util.stream.StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        StreamSpliterators$SliceSpliterator.OfRef.lambda$tryAdvance$0(obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                this.index++;
            }
            if (j10 >= this.fence) {
                return false;
            }
            this.index = j10 + 1;
            return this.f18487s.tryAdvance(consumer);
        }
    }

    StreamSpliterators$SliceSpliterator(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        this.f18487s = spliterator;
        this.sliceOrigin = j10;
        this.sliceFence = j11;
        this.index = j12;
        this.fence = j13;
    }

    public int characteristics() {
        return this.f18487s.characteristics();
    }

    public long estimateSize() {
        long j10 = this.sliceOrigin;
        long j11 = this.fence;
        if (j10 < j11) {
            return j11 - Math.max(j10, this.index);
        }
        return 0L;
    }

    protected abstract Spliterator makeSpliterator(Spliterator spliterator, long j10, long j11, long j12, long j13);

    public Spliterator trySplit() {
        long j10 = this.sliceOrigin;
        long j11 = this.fence;
        if (j10 >= j11 || this.index >= j11) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f18487s.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = this.index + trySplit.estimateSize();
            long min = Math.min(estimateSize, this.sliceFence);
            long j12 = this.sliceOrigin;
            if (j12 >= min) {
                this.index = min;
            } else {
                long j13 = this.sliceFence;
                if (min < j13) {
                    long j14 = this.index;
                    if (j14 < j12 || estimateSize > j13) {
                        this.index = min;
                        return makeSpliterator(trySplit, j12, j13, j14, min);
                    }
                    this.index = min;
                    return trySplit;
                }
                this.f18487s = trySplit;
                this.fence = min;
            }
        }
    }
}
