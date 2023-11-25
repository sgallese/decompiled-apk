package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAdjusters;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ZoneOffsetTransitionRule implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final byte dom;
    private final DayOfWeek dow;
    private final Month month;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final ZoneOffset standardOffset;
    private final LocalTime time;
    private final TimeDefinition timeDefinition;
    private final boolean timeEndOfDay;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.zone.ZoneOffsetTransitionRule$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$zone$ZoneOffsetTransitionRule$TimeDefinition;

        static {
            int[] iArr = new int[TimeDefinition.values().length];
            $SwitchMap$java$time$zone$ZoneOffsetTransitionRule$TimeDefinition = iArr;
            try {
                iArr[TimeDefinition.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$zone$ZoneOffsetTransitionRule$TimeDefinition[TimeDefinition.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD;

        public LocalDateTime createDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
            long totalSeconds;
            int i10 = AnonymousClass1.$SwitchMap$java$time$zone$ZoneOffsetTransitionRule$TimeDefinition[ordinal()];
            if (i10 == 1) {
                totalSeconds = zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds();
            } else if (i10 != 2) {
                return localDateTime;
            } else {
                totalSeconds = zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds();
            }
            return localDateTime.plusSeconds(totalSeconds);
        }
    }

    ZoneOffsetTransitionRule(Month month, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.month = month;
        this.dom = (byte) i10;
        this.dow = dayOfWeek;
        this.time = localTime;
        this.timeEndOfDay = z10;
        this.timeDefinition = timeDefinition;
        this.standardOffset = zoneOffset;
        this.offsetBefore = zoneOffset2;
        this.offsetAfter = zoneOffset3;
    }

    public static ZoneOffsetTransitionRule of(Month month, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        Objects.requireNonNull(month, "month");
        Objects.requireNonNull(localTime, "time");
        Objects.requireNonNull(timeDefinition, "timeDefnition");
        Objects.requireNonNull(zoneOffset, "standardOffset");
        Objects.requireNonNull(zoneOffset2, "offsetBefore");
        Objects.requireNonNull(zoneOffset3, "offsetAfter");
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (!z10 || localTime.equals(LocalTime.MIDNIGHT)) {
            if (localTime.getNano() == 0) {
                return new ZoneOffsetTransitionRule(month, i10, dayOfWeek, localTime, z10, timeDefinition, zoneOffset, zoneOffset2, zoneOffset3);
            }
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffsetTransitionRule readExternal(DataInput dataInput) {
        int readInt = dataInput.readInt();
        Month of = Month.of(readInt >>> 28);
        int i10 = ((264241152 & readInt) >>> 22) - 32;
        int i11 = (3670016 & readInt) >>> 19;
        DayOfWeek of2 = i11 == 0 ? null : DayOfWeek.of(i11);
        int i12 = (507904 & readInt) >>> 14;
        TimeDefinition timeDefinition = TimeDefinition.values()[(readInt & 12288) >>> 12];
        int i13 = (readInt & 4080) >>> 4;
        int i14 = (readInt & 12) >>> 2;
        int i15 = readInt & 3;
        LocalTime ofSecondOfDay = i12 == 31 ? LocalTime.ofSecondOfDay(dataInput.readInt()) : LocalTime.of(i12 % 24, 0);
        ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(i13 == 255 ? dataInput.readInt() : (i13 - 128) * 900);
        return of(of, i10, of2, ofSecondOfDay, i12 == 24, timeDefinition, ofTotalSeconds, ZoneOffset.ofTotalSeconds(i14 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i14 * 1800)), ZoneOffset.ofTotalSeconds(i15 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i15 * 1800)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    public ZoneOffsetTransition createTransition(int i10) {
        LocalDate of;
        TemporalAdjuster nextOrSame;
        byte b10 = this.dom;
        if (b10 < 0) {
            Month month = this.month;
            of = LocalDate.of(i10, month, month.length(IsoChronology.INSTANCE.isLeapYear(i10)) + 1 + this.dom);
            DayOfWeek dayOfWeek = this.dow;
            if (dayOfWeek != null) {
                nextOrSame = TemporalAdjusters.previousOrSame(dayOfWeek);
                of = of.with(nextOrSame);
            }
        } else {
            of = LocalDate.of(i10, this.month, b10);
            DayOfWeek dayOfWeek2 = this.dow;
            if (dayOfWeek2 != null) {
                nextOrSame = TemporalAdjusters.nextOrSame(dayOfWeek2);
                of = of.with(nextOrSame);
            }
        }
        if (this.timeEndOfDay) {
            of = of.plusDays(1L);
        }
        return new ZoneOffsetTransition(this.timeDefinition.createDateTime(LocalDateTime.of(of, this.time), this.standardOffset, this.offsetBefore), this.offsetBefore, this.offsetAfter);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZoneOffsetTransitionRule) {
            ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
            return this.month == zoneOffsetTransitionRule.month && this.dom == zoneOffsetTransitionRule.dom && this.dow == zoneOffsetTransitionRule.dow && this.timeDefinition == zoneOffsetTransitionRule.timeDefinition && this.time.equals(zoneOffsetTransitionRule.time) && this.timeEndOfDay == zoneOffsetTransitionRule.timeEndOfDay && this.standardOffset.equals(zoneOffsetTransitionRule.standardOffset) && this.offsetBefore.equals(zoneOffsetTransitionRule.offsetBefore) && this.offsetAfter.equals(zoneOffsetTransitionRule.offsetAfter);
        }
        return false;
    }

    public int hashCode() {
        int secondOfDay = ((this.time.toSecondOfDay() + (this.timeEndOfDay ? 1 : 0)) << 15) + (this.month.ordinal() << 11) + ((this.dom + 32) << 5);
        DayOfWeek dayOfWeek = this.dow;
        return ((((secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)) + this.timeDefinition.ordinal()) ^ this.standardOffset.hashCode()) ^ this.offsetBefore.hashCode()) ^ this.offsetAfter.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TransitionRule["
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.offsetBefore
            j$.time.ZoneOffset r2 = r5.offsetAfter
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L17
            java.lang.String r1 = "Gap "
            goto L19
        L17:
            java.lang.String r1 = "Overlap "
        L19:
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.offsetBefore
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.offsetAfter
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            j$.time.DayOfWeek r1 = r5.dow
            r2 = 32
            if (r1 == 0) goto L68
            byte r3 = r5.dom
            r4 = -1
            java.lang.String r1 = r1.name()
            r0.append(r1)
            if (r3 != r4) goto L51
            java.lang.String r1 = " on or before last day of "
        L44:
            r0.append(r1)
            j$.time.Month r1 = r5.month
            java.lang.String r1 = r1.name()
            r0.append(r1)
            goto L79
        L51:
            if (r3 >= 0) goto L63
            java.lang.String r1 = " on or before last day minus "
            r0.append(r1)
            byte r1 = r5.dom
            int r1 = -r1
            int r1 = r1 + (-1)
            r0.append(r1)
            java.lang.String r1 = " of "
            goto L44
        L63:
            java.lang.String r1 = " on or after "
            r0.append(r1)
        L68:
            j$.time.Month r1 = r5.month
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r0.append(r2)
            byte r1 = r5.dom
            r0.append(r1)
        L79:
            java.lang.String r1 = " at "
            r0.append(r1)
            boolean r1 = r5.timeEndOfDay
            if (r1 == 0) goto L85
            java.lang.String r1 = "24:00"
            goto L8b
        L85:
            j$.time.LocalTime r1 = r5.time
            java.lang.String r1 = r1.toString()
        L8b:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            j$.time.zone.ZoneOffsetTransitionRule$TimeDefinition r1 = r5.timeDefinition
            r0.append(r1)
            java.lang.String r1 = ", standard offset "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r5.standardOffset
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneOffsetTransitionRule.toString():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        int secondOfDay = this.timeEndOfDay ? 86400 : this.time.toSecondOfDay();
        int totalSeconds = this.standardOffset.getTotalSeconds();
        int totalSeconds2 = this.offsetBefore.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.offsetAfter.getTotalSeconds() - totalSeconds;
        int hour = secondOfDay % 3600 == 0 ? this.timeEndOfDay ? 24 : this.time.getHour() : 31;
        int i10 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i11 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i12 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.dow;
        dataOutput.writeInt((this.month.getValue() << 28) + ((this.dom + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (hour << 14) + (this.timeDefinition.ordinal() << 12) + (i10 << 4) + (i11 << 2) + i12);
        if (hour == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i10 == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i11 == 3) {
            dataOutput.writeInt(this.offsetBefore.getTotalSeconds());
        }
        if (i12 == 3) {
            dataOutput.writeInt(this.offsetAfter.getTotalSeconds());
        }
    }
}
