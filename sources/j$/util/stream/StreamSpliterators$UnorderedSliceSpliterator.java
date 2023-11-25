package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.function.LongConsumer$CC;
import j$.util.stream.StreamSpliterators$ArrayBuffer;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class StreamSpliterators$UnorderedSliceSpliterator {
    protected final int chunkSize;
    private final AtomicLong permits;

    /* renamed from: s  reason: collision with root package name */
    protected final Spliterator f18488s;
    private final long skipThreshold;
    protected final boolean unlimited;

    /* loaded from: classes2.dex */
    static final class OfDouble extends OfPrimitive implements Spliterator.OfDouble, DoubleConsumer {
        double tmpValue;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfDouble(Spliterator.OfDouble ofDouble, long j10, long j11) {
            super(ofDouble, j10, j11);
        }

        OfDouble(Spliterator.OfDouble ofDouble, OfDouble ofDouble2) {
            super(ofDouble, ofDouble2);
        }

        @Override // java.util.function.DoubleConsumer
        public void accept(double d10) {
            this.tmpValue = d10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive
        public void acceptConsumed(DoubleConsumer doubleConsumer) {
            doubleConsumer.accept(this.tmpValue);
        }

        public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
            return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive
        public StreamSpliterators$ArrayBuffer.OfDouble bufferCreate(int i10) {
            return new StreamSpliterators$ArrayBuffer.OfDouble(i10);
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
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator
        public Spliterator.OfDouble makeSpliterator(Spliterator.OfDouble ofDouble) {
            return new OfDouble(ofDouble, this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfDouble
        public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
            return super.tryAdvance((Object) doubleConsumer);
        }

        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive, j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
            return (Spliterator.OfDouble) super.trySplit();
        }
    }

    /* loaded from: classes2.dex */
    static final class OfInt extends OfPrimitive implements Spliterator.OfInt, IntConsumer {
        int tmpValue;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt(Spliterator.OfInt ofInt, long j10, long j11) {
            super(ofInt, j10, j11);
        }

        OfInt(Spliterator.OfInt ofInt, OfInt ofInt2) {
            super(ofInt, ofInt2);
        }

        @Override // java.util.function.IntConsumer
        public void accept(int i10) {
            this.tmpValue = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive
        public void acceptConsumed(IntConsumer intConsumer) {
            intConsumer.accept(this.tmpValue);
        }

        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
            return IntConsumer$CC.$default$andThen(this, intConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive
        public StreamSpliterators$ArrayBuffer.OfInt bufferCreate(int i10) {
            return new StreamSpliterators$ArrayBuffer.OfInt(i10);
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
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator
        public Spliterator.OfInt makeSpliterator(Spliterator.OfInt ofInt) {
            return new OfInt(ofInt, this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
            return super.tryAdvance((Object) intConsumer);
        }

        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive, j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
            return (Spliterator.OfInt) super.trySplit();
        }
    }

    /* loaded from: classes2.dex */
    static final class OfLong extends OfPrimitive implements Spliterator.OfLong, LongConsumer {
        long tmpValue;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong(Spliterator.OfLong ofLong, long j10, long j11) {
            super(ofLong, j10, j11);
        }

        OfLong(Spliterator.OfLong ofLong, OfLong ofLong2) {
            super(ofLong, ofLong2);
        }

        @Override // java.util.function.LongConsumer
        public void accept(long j10) {
            this.tmpValue = j10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive
        public void acceptConsumed(LongConsumer longConsumer) {
            longConsumer.accept(this.tmpValue);
        }

        public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
            return LongConsumer$CC.$default$andThen(this, longConsumer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive
        public StreamSpliterators$ArrayBuffer.OfLong bufferCreate(int i10) {
            return new StreamSpliterators$ArrayBuffer.OfLong(i10);
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
        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator
        public Spliterator.OfLong makeSpliterator(Spliterator.OfLong ofLong) {
            return new OfLong(ofLong, this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.OfLong.CC.$default$tryAdvance(this, consumer);
        }

        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
            return super.tryAdvance((Object) longConsumer);
        }

        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator.OfPrimitive, j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
            return (Spliterator.OfLong) super.trySplit();
        }
    }

    /* loaded from: classes2.dex */
    static abstract class OfPrimitive extends StreamSpliterators$UnorderedSliceSpliterator implements Spliterator.OfPrimitive {
        OfPrimitive(Spliterator.OfPrimitive ofPrimitive, long j10, long j11) {
            super(ofPrimitive, j10, j11);
        }

        OfPrimitive(Spliterator.OfPrimitive ofPrimitive, OfPrimitive ofPrimitive2) {
            super(ofPrimitive, ofPrimitive2);
        }

        protected abstract void acceptConsumed(Object obj);

        protected abstract StreamSpliterators$ArrayBuffer.OfPrimitive bufferCreate(int i10);

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(Object obj) {
            Objects.requireNonNull(obj);
            StreamSpliterators$ArrayBuffer.OfPrimitive ofPrimitive = null;
            while (true) {
                PermitStatus permitStatus = permitStatus();
                if (permitStatus == PermitStatus.NO_MORE) {
                    return;
                }
                if (permitStatus != PermitStatus.MAYBE_MORE) {
                    ((Spliterator.OfPrimitive) this.f18488s).forEachRemaining(obj);
                    return;
                }
                if (ofPrimitive == null) {
                    ofPrimitive = bufferCreate(this.chunkSize);
                } else {
                    ofPrimitive.reset();
                }
                long j10 = 0;
                while (((Spliterator.OfPrimitive) this.f18488s).tryAdvance(ofPrimitive)) {
                    j10++;
                    if (j10 >= this.chunkSize) {
                        break;
                    }
                }
                if (j10 == 0) {
                    return;
                }
                ofPrimitive.forEach(obj, acquirePermits(j10));
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
            Objects.requireNonNull(obj);
            while (permitStatus() != PermitStatus.NO_MORE && ((Spliterator.OfPrimitive) this.f18488s).tryAdvance(this)) {
                if (acquirePermits(1L) == 1) {
                    acceptConsumed(obj);
                    return true;
                }
            }
            return false;
        }

        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
            return (Spliterator.OfPrimitive) super.trySplit();
        }
    }

    /* loaded from: classes2.dex */
    static final class OfRef extends StreamSpliterators$UnorderedSliceSpliterator implements Spliterator, Consumer {
        Object tmpSlot;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfRef(Spliterator spliterator, long j10, long j11) {
            super(spliterator, j10, j11);
        }

        OfRef(Spliterator spliterator, OfRef ofRef) {
            super(spliterator, ofRef);
        }

        @Override // java.util.function.Consumer
        public final void accept(Object obj) {
            this.tmpSlot = obj;
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            Objects.requireNonNull(consumer);
            StreamSpliterators$ArrayBuffer.OfRef ofRef = null;
            while (true) {
                PermitStatus permitStatus = permitStatus();
                if (permitStatus == PermitStatus.NO_MORE) {
                    return;
                }
                if (permitStatus != PermitStatus.MAYBE_MORE) {
                    this.f18488s.forEachRemaining(consumer);
                    return;
                }
                if (ofRef == null) {
                    ofRef = new StreamSpliterators$ArrayBuffer.OfRef(this.chunkSize);
                } else {
                    ofRef.reset();
                }
                long j10 = 0;
                while (this.f18488s.tryAdvance(ofRef)) {
                    j10++;
                    if (j10 >= this.chunkSize) {
                        break;
                    }
                }
                if (j10 == 0) {
                    return;
                }
                ofRef.forEach(consumer, acquirePermits(j10));
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

        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator
        protected Spliterator makeSpliterator(Spliterator spliterator) {
            return new OfRef(spliterator, this);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (permitStatus() != PermitStatus.NO_MORE && this.f18488s.tryAdvance(this)) {
                if (acquirePermits(1L) == 1) {
                    consumer.accept(this.tmpSlot);
                    this.tmpSlot = null;
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum PermitStatus {
        NO_MORE,
        MAYBE_MORE,
        UNLIMITED
    }

    StreamSpliterators$UnorderedSliceSpliterator(Spliterator spliterator, long j10, long j11) {
        this.f18488s = spliterator;
        this.unlimited = j11 < 0;
        this.skipThreshold = j11 >= 0 ? j11 : 0L;
        this.chunkSize = 128;
        this.permits = new AtomicLong(j11 >= 0 ? j10 + j11 : j10);
    }

    StreamSpliterators$UnorderedSliceSpliterator(Spliterator spliterator, StreamSpliterators$UnorderedSliceSpliterator streamSpliterators$UnorderedSliceSpliterator) {
        this.f18488s = spliterator;
        this.unlimited = streamSpliterators$UnorderedSliceSpliterator.unlimited;
        this.permits = streamSpliterators$UnorderedSliceSpliterator.permits;
        this.skipThreshold = streamSpliterators$UnorderedSliceSpliterator.skipThreshold;
        this.chunkSize = streamSpliterators$UnorderedSliceSpliterator.chunkSize;
    }

    protected final long acquirePermits(long j10) {
        long j11;
        long min;
        do {
            j11 = this.permits.get();
            if (j11 != 0) {
                min = Math.min(j11, j10);
                if (min <= 0) {
                    break;
                }
            } else if (this.unlimited) {
                return j10;
            } else {
                return 0L;
            }
        } while (!this.permits.compareAndSet(j11, j11 - min));
        if (this.unlimited) {
            return Math.max(j10 - min, 0L);
        }
        long j12 = this.skipThreshold;
        return j11 > j12 ? Math.max(min - (j11 - j12), 0L) : min;
    }

    public final int characteristics() {
        return this.f18488s.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f18488s.estimateSize();
    }

    protected abstract Spliterator makeSpliterator(Spliterator spliterator);

    protected final PermitStatus permitStatus() {
        return this.permits.get() > 0 ? PermitStatus.MAYBE_MORE : this.unlimited ? PermitStatus.UNLIMITED : PermitStatus.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.permits.get() == 0 || (trySplit = this.f18488s.trySplit()) == null) {
            return null;
        }
        return makeSpliterator(trySplit);
    }
}
