package j$.util.function;

import j$.util.Objects;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.DoubleUnaryOperator$-CC  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class DoubleUnaryOperator$CC {
    public static DoubleUnaryOperator $default$andThen(final DoubleUnaryOperator doubleUnaryOperator, final DoubleUnaryOperator doubleUnaryOperator2) {
        Objects.requireNonNull(doubleUnaryOperator2);
        return new DoubleUnaryOperator() { // from class: j$.util.function.DoubleUnaryOperator$$ExternalSyntheticLambda1
            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator3) {
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator3);
            }

            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                double applyAsDouble;
                applyAsDouble = doubleUnaryOperator2.applyAsDouble(DoubleUnaryOperator.this.applyAsDouble(d10));
                return applyAsDouble;
            }

            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator3) {
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator3);
            }
        };
    }

    public static DoubleUnaryOperator $default$compose(final DoubleUnaryOperator doubleUnaryOperator, final DoubleUnaryOperator doubleUnaryOperator2) {
        Objects.requireNonNull(doubleUnaryOperator2);
        return new DoubleUnaryOperator() { // from class: j$.util.function.DoubleUnaryOperator$$ExternalSyntheticLambda0
            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator3) {
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator3);
            }

            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                double applyAsDouble;
                applyAsDouble = DoubleUnaryOperator.this.applyAsDouble(doubleUnaryOperator2.applyAsDouble(d10));
                return applyAsDouble;
            }

            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator3) {
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator3);
            }
        };
    }
}
