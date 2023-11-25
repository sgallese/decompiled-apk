package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import j$.util.stream.Sink;
import j$.util.stream.SpinedBuffer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class StreamSpliterators$DoubleWrappingSpliterator extends StreamSpliterators$AbstractWrappingSpliterator implements Spliterator.OfDouble {
    StreamSpliterators$DoubleWrappingSpliterator(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z10) {
        super(pipelineHelper, spliterator, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamSpliterators$DoubleWrappingSpliterator(PipelineHelper pipelineHelper, Supplier supplier, boolean z10) {
        super(pipelineHelper, supplier, z10);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.OfDouble.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public void forEachRemaining(final DoubleConsumer doubleConsumer) {
        if (this.buffer != null || this.finished) {
            do {
            } while (tryAdvance(doubleConsumer));
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        init();
        PipelineHelper pipelineHelper = this.ph;
        Objects.requireNonNull(doubleConsumer);
        pipelineHelper.wrapAndCopyInto(new Sink.OfDouble() { // from class: j$.util.stream.StreamSpliterators$DoubleWrappingSpliterator$$ExternalSyntheticLambda2
            @Override // j$.util.stream.Sink.OfDouble, j$.util.stream.Sink, java.util.function.DoubleConsumer
            public final void accept(double d10) {
                DoubleConsumer.this.accept(d10);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(int i10) {
                Sink.CC.$default$accept((Sink) this, i10);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(long j10) {
                Sink.CC.$default$accept((Sink) this, j10);
            }

            @Override // j$.util.stream.Sink.OfDouble
            public /* synthetic */ void accept(Double d10) {
                Sink.OfDouble.CC.$default$accept((Sink.OfDouble) this, d10);
            }

            @Override // java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Sink.OfDouble.CC.$default$accept(this, obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }

            public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer2) {
                return DoubleConsumer$CC.$default$andThen(this, doubleConsumer2);
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
        final SpinedBuffer.OfDouble ofDouble = new SpinedBuffer.OfDouble();
        this.buffer = ofDouble;
        PipelineHelper pipelineHelper = this.ph;
        Objects.requireNonNull(ofDouble);
        this.bufferSink = pipelineHelper.wrapSink(new Sink.OfDouble() { // from class: j$.util.stream.StreamSpliterators$DoubleWrappingSpliterator$$ExternalSyntheticLambda0
            @Override // j$.util.stream.Sink.OfDouble, j$.util.stream.Sink, java.util.function.DoubleConsumer
            public final void accept(double d10) {
                SpinedBuffer.OfDouble.this.accept(d10);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(int i10) {
                Sink.CC.$default$accept((Sink) this, i10);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(long j10) {
                Sink.CC.$default$accept((Sink) this, j10);
            }

            @Override // j$.util.stream.Sink.OfDouble
            public /* synthetic */ void accept(Double d10) {
                Sink.OfDouble.CC.$default$accept((Sink.OfDouble) this, d10);
            }

            @Override // java.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Sink.OfDouble.CC.$default$accept(this, obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }

            public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
                return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
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
        this.pusher = new BooleanSupplier() { // from class: j$.util.stream.StreamSpliterators$DoubleWrappingSpliterator$$ExternalSyntheticLambda1
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return StreamSpliterators$DoubleWrappingSpliterator.this.m228xbf8f913e();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initPartialTraversalState$0$java-util-stream-StreamSpliterators$DoubleWrappingSpliterator  reason: not valid java name */
    public /* synthetic */ boolean m228xbf8f913e() {
        return this.spliterator.tryAdvance(this.bufferSink);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean doAdvance = doAdvance();
        if (doAdvance) {
            doubleConsumer.accept(((SpinedBuffer.OfDouble) this.buffer).get(this.nextToConsume));
        }
        return doAdvance;
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator, j$.util.Spliterator
    public Spliterator.OfDouble trySplit() {
        return (Spliterator.OfDouble) super.trySplit();
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator
    StreamSpliterators$AbstractWrappingSpliterator wrap(Spliterator spliterator) {
        return new StreamSpliterators$DoubleWrappingSpliterator(this.ph, spliterator, this.isParallel);
    }
}
