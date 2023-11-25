package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.DoublePipeline;
import j$.util.stream.IntPipeline;
import j$.util.stream.LongPipeline;
import j$.util.stream.ReferencePipeline;

/* loaded from: classes2.dex */
public abstract class StreamSupport {
    public static DoubleStream doubleStream(Spliterator.OfDouble ofDouble, boolean z10) {
        return new DoublePipeline.Head(ofDouble, StreamOpFlag.fromCharacteristics(ofDouble), z10);
    }

    public static IntStream intStream(Spliterator.OfInt ofInt, boolean z10) {
        return new IntPipeline.Head(ofInt, StreamOpFlag.fromCharacteristics(ofInt), z10);
    }

    public static LongStream longStream(Spliterator.OfLong ofLong, boolean z10) {
        return new LongPipeline.Head(ofLong, StreamOpFlag.fromCharacteristics(ofLong), z10);
    }

    public static Stream stream(Spliterator spliterator, boolean z10) {
        Objects.requireNonNull(spliterator);
        return new ReferencePipeline.Head(spliterator, StreamOpFlag.fromCharacteristics(spliterator), z10);
    }
}
