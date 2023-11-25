package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.stream.Sink;
import j$.util.stream.SpinedBuffer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class StreamSpliterators$IntWrappingSpliterator extends StreamSpliterators$AbstractWrappingSpliterator implements Spliterator.OfInt {
    StreamSpliterators$IntWrappingSpliterator(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z10) {
        super(pipelineHelper, spliterator, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamSpliterators$IntWrappingSpliterator(PipelineHelper pipelineHelper, Supplier supplier, boolean z10) {
        super(pipelineHelper, supplier, z10);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public void forEachRemaining(final IntConsumer intConsumer) {
        if (this.buffer != null || this.finished) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        init();
        PipelineHelper pipelineHelper = this.ph;
        Objects.requireNonNull(intConsumer);
        pipelineHelper.wrapAndCopyInto(new Sink.OfInt() { // from class: j$.util.stream.StreamSpliterators$IntWrappingSpliterator$$ExternalSyntheticLambda2
            @Override // j$.util.stream.Sink, java.util.function.DoubleConsumer
            public /* synthetic */ void accept(double d10) {
                Sink.CC.$default$accept(this, d10);
            }

            @Override // j$.util.stream.Sink.OfInt, j$.util.stream.Sink
            public final void accept(int i10) {
                IntConsumer.this.accept(i10);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(long j10) {
                Sink.CC.$default$accept((Sink) this, j10);
            }

            @Override // j$.util.stream.Sink.OfInt
            public /* synthetic */ void accept(Integer num) {
                Sink.OfInt.CC.$default$accept((Sink.OfInt) this, num);
            }

            @Override // java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Sink.OfInt.CC.$default$accept(this, obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                return IntConsumer$CC.$default$andThen(this, intConsumer2);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void begin(long j10) {
                Sink.CC.$default$begin(this, j10);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ boolean cancellationRequested() {
                return Sink.CC.$default$cancellationRequested(this);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void end() {
                Sink.CC.$default$end(this);
            }
        }, this.spliterator);
        this.finished = true;
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator
    void initPartialTraversalState() {
        final SpinedBuffer.OfInt ofInt = new SpinedBuffer.OfInt();
        this.buffer = ofInt;
        PipelineHelper pipelineHelper = this.ph;
        Objects.requireNonNull(ofInt);
        this.bufferSink = pipelineHelper.wrapSink(new Sink.OfInt() { // from class: j$.util.stream.StreamSpliterators$IntWrappingSpliterator$$ExternalSyntheticLambda0
            @Override // j$.util.stream.Sink, java.util.function.DoubleConsumer
            public /* synthetic */ void accept(double d10) {
                Sink.CC.$default$accept(this, d10);
            }

            @Override // j$.util.stream.Sink.OfInt, j$.util.stream.Sink
            public final void accept(int i10) {
                SpinedBuffer.OfInt.this.accept(i10);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(long j10) {
                Sink.CC.$default$accept((Sink) this, j10);
            }

            @Override // j$.util.stream.Sink.OfInt
            public /* synthetic */ void accept(Integer num) {
                Sink.OfInt.CC.$default$accept((Sink.OfInt) this, num);
            }

            @Override // java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Sink.OfInt.CC.$default$accept(this, obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void begin(long j10) {
                Sink.CC.$default$begin(this, j10);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ boolean cancellationRequested() {
                return Sink.CC.$default$cancellationRequested(this);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void end() {
                Sink.CC.$default$end(this);
            }
        });
        this.pusher = new BooleanSupplier() { // from class: j$.util.stream.StreamSpliterators$IntWrappingSpliterator$$ExternalSyntheticLambda1
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return StreamSpliterators$IntWrappingSpliterator.this.m229x68714704();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initPartialTraversalState$0$java-util-stream-StreamSpliterators$IntWrappingSpliterator  reason: not valid java name */
    public /* synthetic */ boolean m229x68714704() {
        return this.spliterator.tryAdvance(this.bufferSink);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean doAdvance = doAdvance();
        if (doAdvance) {
            intConsumer.accept(((SpinedBuffer.OfInt) this.buffer).get(this.nextToConsume));
        }
        return doAdvance;
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator, j$.util.Spliterator
    public Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator
    StreamSpliterators$AbstractWrappingSpliterator wrap(Spliterator spliterator) {
        return new StreamSpliterators$IntWrappingSpliterator(this.ph, spliterator, this.isParallel);
    }
}
