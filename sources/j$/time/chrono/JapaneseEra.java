package j$.time.chrono;

import com.google.android.gms.ads.RequestConfiguration;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.chrono.Era;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class JapaneseEra implements Era, Serializable {
    public static final JapaneseEra HEISEI;
    private static final JapaneseEra[] KNOWN_ERAS;
    public static final JapaneseEra MEIJI;
    private static final int N_ERA_CONSTANTS;
    public static final JapaneseEra REIWA;
    public static final JapaneseEra SHOWA;
    public static final JapaneseEra TAISHO;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient String abbreviation;
    private final transient int eraValue;
    private final transient String name;
    private final transient LocalDate since;

    static {
        JapaneseEra japaneseEra = new JapaneseEra(-1, LocalDate.of(1868, 1, 1), "Meiji", "M");
        MEIJI = japaneseEra;
        JapaneseEra japaneseEra2 = new JapaneseEra(0, LocalDate.of(1912, 7, 30), "Taisho", RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        TAISHO = japaneseEra2;
        JapaneseEra japaneseEra3 = new JapaneseEra(1, LocalDate.of(1926, 12, 25), "Showa", "S");
        SHOWA = japaneseEra3;
        JapaneseEra japaneseEra4 = new JapaneseEra(2, LocalDate.of(1989, 1, 8), "Heisei", "H");
        HEISEI = japaneseEra4;
        JapaneseEra japaneseEra5 = new JapaneseEra(3, LocalDate.of(2019, 5, 1), "Reiwa", "R");
        REIWA = japaneseEra5;
        int value = japaneseEra5.getValue() + 2;
        N_ERA_CONSTANTS = value;
        JapaneseEra[] japaneseEraArr = new JapaneseEra[value];
        KNOWN_ERAS = japaneseEraArr;
        japaneseEraArr[0] = japaneseEra;
        japaneseEraArr[1] = japaneseEra2;
        japaneseEraArr[2] = japaneseEra3;
        japaneseEraArr[3] = japaneseEra4;
        japaneseEraArr[4] = japaneseEra5;
    }

    private JapaneseEra(int i10, LocalDate localDate, String str, String str2) {
        this.eraValue = i10;
        this.since = localDate;
        this.name = str;
        this.abbreviation = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JapaneseEra from(LocalDate localDate) {
        if (localDate.isBefore(JapaneseDate.MEIJI_6_ISODATE)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = KNOWN_ERAS.length - 1; length >= 0; length--) {
            JapaneseEra japaneseEra = KNOWN_ERAS[length];
            if (localDate.compareTo((ChronoLocalDate) japaneseEra.since) >= 0) {
                return japaneseEra;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JapaneseEra getCurrentEra() {
        return KNOWN_ERAS[r0.length - 1];
    }

    public static JapaneseEra of(int i10) {
        int ordinal = ordinal(i10);
        if (ordinal >= 0) {
            JapaneseEra[] japaneseEraArr = KNOWN_ERAS;
            if (ordinal < japaneseEraArr.length) {
                return japaneseEraArr[ordinal];
            }
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    private static int ordinal(int i10) {
        return (i10 + 2) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JapaneseEra readExternal(DataInput dataInput) {
        return of(dataInput.readByte());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long shortestDaysOfYear() {
        long smallestMaximum = ChronoField.DAY_OF_YEAR.range().getSmallestMaximum();
        for (JapaneseEra japaneseEra : KNOWN_ERAS) {
            smallestMaximum = Math.min(smallestMaximum, (japaneseEra.since.lengthOfYear() - japaneseEra.since.getDayOfYear()) + 1);
            if (japaneseEra.next() != null) {
                smallestMaximum = Math.min(smallestMaximum, (long) (japaneseEra.next().since.getDayOfYear() - 1));
            }
        }
        return smallestMaximum;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long shortestYearsOfEra() {
        int year = (999999999 - getCurrentEra().since.getYear()) + 1;
        int year2 = KNOWN_ERAS[0].since.getYear();
        int i10 = 1;
        while (true) {
            JapaneseEra[] japaneseEraArr = KNOWN_ERAS;
            if (i10 >= japaneseEraArr.length) {
                return year;
            }
            JapaneseEra japaneseEra = japaneseEraArr[i10];
            year = Math.min(year, (japaneseEra.since.getYear() - year2) + 1);
            year2 = japaneseEra.since.getYear();
            i10++;
        }
    }

    public static JapaneseEra[] values() {
        JapaneseEra[] japaneseEraArr = KNOWN_ERAS;
        return (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, japaneseEraArr.length);
    }

    private Object writeReplace() {
        return new Ser((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public /* synthetic */ Temporal adjustInto(Temporal temporal) {
        Temporal with;
        with = temporal.with(ChronoField.ERA, getValue());
        return with;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int get(TemporalField temporalField) {
        return Era.CC.$default$get(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ long getLong(TemporalField temporalField) {
        return Era.CC.$default$getLong(this, temporalField);
    }

    String getName() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalDate getSince() {
        return this.since;
    }

    @Override // j$.time.chrono.Era
    public int getValue() {
        return this.eraValue;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean isSupported(TemporalField temporalField) {
        return Era.CC.$default$isSupported(this, temporalField);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JapaneseEra next() {
        if (this == getCurrentEra()) {
            return null;
        }
        return of(this.eraValue + 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ Object query(TemporalQuery temporalQuery) {
        return Era.CC.$default$query(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        ValueRange $default$range;
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField == chronoField) {
            return JapaneseChronology.INSTANCE.range(chronoField);
        }
        $default$range = TemporalAccessor.CC.$default$range(this, temporalField);
        return $default$range;
    }

    public String toString() {
        return getName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }
}
