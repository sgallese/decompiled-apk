package j$.time.temporal;

import j$.time.format.ResolverStyle;
import java.util.Map;

/* loaded from: classes2.dex */
public interface TemporalField {

    /* renamed from: j$.time.temporal.TemporalField$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static TemporalAccessor $default$resolve(TemporalField temporalField, Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
            return null;
        }
    }

    Temporal adjustInto(Temporal temporal, long j10);

    long getFrom(TemporalAccessor temporalAccessor);

    boolean isDateBased();

    boolean isSupportedBy(TemporalAccessor temporalAccessor);

    boolean isTimeBased();

    ValueRange range();

    ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor);

    TemporalAccessor resolve(Map map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle);
}
