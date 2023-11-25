package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DateTimeParseContext {
    private ArrayList chronoListeners;
    private DateTimeFormatter formatter;
    private final ArrayList parsed;
    private boolean caseSensitive = true;
    private boolean strict = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeParseContext(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.parsed = arrayList;
        this.chronoListeners = null;
        this.formatter = dateTimeFormatter;
        arrayList.add(new Parsed());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean charEqualsIgnoreCase(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    private Parsed currentParsed() {
        return (Parsed) this.parsed.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addChronoChangedListener(Consumer consumer) {
        if (this.chronoListeners == null) {
            this.chronoListeners = new ArrayList();
        }
        this.chronoListeners.add(consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean charEquals(char c10, char c11) {
        return isCaseSensitive() ? c10 == c11 : charEqualsIgnoreCase(c10, c11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeParseContext copy() {
        DateTimeParseContext dateTimeParseContext = new DateTimeParseContext(this.formatter);
        dateTimeParseContext.caseSensitive = this.caseSensitive;
        dateTimeParseContext.strict = this.strict;
        return dateTimeParseContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void endOptional(boolean z10) {
        ArrayList arrayList;
        int size;
        if (z10) {
            arrayList = this.parsed;
            size = arrayList.size() - 2;
        } else {
            arrayList = this.parsed;
            size = arrayList.size() - 1;
        }
        arrayList.remove(size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecimalStyle getDecimalStyle() {
        return this.formatter.getDecimalStyle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Chronology getEffectiveChronology() {
        Chronology chronology = currentParsed().chrono;
        if (chronology == null) {
            Chronology chronology2 = this.formatter.getChronology();
            return chronology2 == null ? IsoChronology.INSTANCE : chronology2;
        }
        return chronology;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale getLocale() {
        return this.formatter.getLocale();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long getParsed(TemporalField temporalField) {
        return (Long) currentParsed().fieldValues.get(temporalField);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isCaseSensitive() {
        return this.caseSensitive;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isStrict() {
        return this.strict;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCaseSensitive(boolean z10) {
        this.caseSensitive = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setParsed(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        currentParsed().zone = zoneId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setParsedField(TemporalField temporalField, long j10, int i10, int i11) {
        Objects.requireNonNull(temporalField, "field");
        Long l10 = (Long) currentParsed().fieldValues.put(temporalField, Long.valueOf(j10));
        return (l10 == null || l10.longValue() == j10) ? i11 : ~i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setParsedLeapSecond() {
        currentParsed().leapSecond = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStrict(boolean z10) {
        this.strict = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void startOptional() {
        this.parsed.add(currentParsed().copy());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean subSequenceEquals(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 > charSequence.length() || i11 + i12 > charSequence2.length()) {
            return false;
        }
        if (isCaseSensitive()) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (charSequence.charAt(i10 + i13) != charSequence2.charAt(i11 + i13)) {
                    return false;
                }
            }
            return true;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            char charAt = charSequence.charAt(i10 + i14);
            char charAt2 = charSequence2.charAt(i11 + i14);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TemporalAccessor toResolved(ResolverStyle resolverStyle, Set set) {
        Parsed currentParsed = currentParsed();
        currentParsed.chrono = getEffectiveChronology();
        ZoneId zoneId = currentParsed.zone;
        if (zoneId == null) {
            zoneId = this.formatter.getZone();
        }
        currentParsed.zone = zoneId;
        return currentParsed.resolve(resolverStyle, set);
    }

    public String toString() {
        return currentParsed().toString();
    }
}
