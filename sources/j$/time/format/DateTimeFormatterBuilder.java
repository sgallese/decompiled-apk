package j$.time.format;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import j$.time.Clock$TickClock$$ExternalSyntheticBackport0;
import j$.time.DateTimeException;
import j$.time.DesugarLocalDate$$ExternalSyntheticBackport1;
import j$.time.Duration$$ExternalSyntheticBackport0;
import j$.time.LocalDate;
import j$.time.LocalDate$$ExternalSyntheticBackport5;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeTextProvider;
import j$.time.temporal.ChronoField;
import j$.time.temporal.IsoFields;
import j$.time.temporal.JulianFields;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.ValueRange;
import j$.time.temporal.WeekFields;
import j$.time.zone.ZoneRulesProvider;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.function.Consumer;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {
    private static final Map FIELD_MAP;
    static final Comparator LENGTH_SORT;
    private static final TemporalQuery QUERY_REGION_ONLY = new TemporalQuery() { // from class: j$.time.format.DateTimeFormatterBuilder$$ExternalSyntheticLambda0
        @Override // j$.time.temporal.TemporalQuery
        public final Object queryFrom(TemporalAccessor temporalAccessor) {
            return DateTimeFormatterBuilder.lambda$static$0(temporalAccessor);
        }
    };
    private DateTimeFormatterBuilder active;
    private final boolean optional;
    private char padNextChar;
    private int padNextWidth;
    private final DateTimeFormatterBuilder parent;
    private final List printerParsers;
    private int valueParserIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.format.DateTimeFormatterBuilder$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$java$time$format$SignStyle;

        static {
            int[] iArr = new int[SignStyle.values().length];
            $SwitchMap$java$time$format$SignStyle = iArr;
            try {
                iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$format$SignStyle[SignStyle.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$format$SignStyle[SignStyle.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$format$SignStyle[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CharLiteralPrinterParser implements DateTimePrinterParser {
        private final char literal;

        CharLiteralPrinterParser(char c10) {
            this.literal = c10;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            sb2.append(this.literal);
            return true;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            if (i10 == charSequence.length()) {
                return ~i10;
            }
            char charAt = charSequence.charAt(i10);
            return (charAt == this.literal || (!dateTimeParseContext.isCaseSensitive() && (Character.toUpperCase(charAt) == Character.toUpperCase(this.literal) || Character.toLowerCase(charAt) == Character.toLowerCase(this.literal)))) ? i10 + 1 : ~i10;
        }

        public String toString() {
            char c10 = this.literal;
            if (c10 == '\'') {
                return "''";
            }
            return "'" + c10 + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CompositePrinterParser implements DateTimePrinterParser {
        private final boolean optional;
        private final DateTimePrinterParser[] printerParsers;

        CompositePrinterParser(List list, boolean z10) {
            this((DateTimePrinterParser[]) list.toArray(new DateTimePrinterParser[list.size()]), z10);
        }

        CompositePrinterParser(DateTimePrinterParser[] dateTimePrinterParserArr, boolean z10) {
            this.printerParsers = dateTimePrinterParserArr;
            this.optional = z10;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            int length = sb2.length();
            if (this.optional) {
                dateTimePrintContext.startOptional();
            }
            try {
                for (DateTimePrinterParser dateTimePrinterParser : this.printerParsers) {
                    if (!dateTimePrinterParser.format(dateTimePrintContext, sb2)) {
                        sb2.setLength(length);
                        return true;
                    }
                }
                if (this.optional) {
                    dateTimePrintContext.endOptional();
                }
                return true;
            } finally {
                if (this.optional) {
                    dateTimePrintContext.endOptional();
                }
            }
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            if (!this.optional) {
                for (DateTimePrinterParser dateTimePrinterParser : this.printerParsers) {
                    i10 = dateTimePrinterParser.parse(dateTimeParseContext, charSequence, i10);
                    if (i10 < 0) {
                        break;
                    }
                }
                return i10;
            }
            dateTimeParseContext.startOptional();
            int i11 = i10;
            for (DateTimePrinterParser dateTimePrinterParser2 : this.printerParsers) {
                i11 = dateTimePrinterParser2.parse(dateTimeParseContext, charSequence, i11);
                if (i11 < 0) {
                    dateTimeParseContext.endOptional(false);
                    return i10;
                }
            }
            dateTimeParseContext.endOptional(true);
            return i11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.printerParsers != null) {
                sb2.append(this.optional ? "[" : "(");
                for (DateTimePrinterParser dateTimePrinterParser : this.printerParsers) {
                    sb2.append(dateTimePrinterParser);
                }
                sb2.append(this.optional ? "]" : ")");
            }
            return sb2.toString();
        }

        public CompositePrinterParser withOptional(boolean z10) {
            return z10 == this.optional ? this : new CompositePrinterParser(this.printerParsers, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface DateTimePrinterParser {
        boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2);

        int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FractionPrinterParser extends NumberPrinterParser {
        private final boolean decimalPoint;

        FractionPrinterParser(TemporalField temporalField, int i10, int i11, boolean z10) {
            this(temporalField, i10, i11, z10, 0);
            Objects.requireNonNull(temporalField, "field");
            if (!temporalField.range().isFixed()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + temporalField);
            } else if (i10 < 0 || i10 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
            } else if (i11 < 1 || i11 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
            } else if (i11 >= i10) {
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
            }
        }

        FractionPrinterParser(TemporalField temporalField, int i10, int i11, boolean z10, int i12) {
            super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i12);
            this.decimalPoint = z10;
        }

        private long convertFromFraction(BigDecimal bigDecimal) {
            ValueRange range = this.field.range();
            BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
            return bigDecimal.multiply(BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        private BigDecimal convertToFraction(long j10) {
            ValueRange range = this.field.range();
            range.checkValidValue(j10, this.field);
            BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
            BigDecimal divide = BigDecimal.valueOf(j10).subtract(valueOf).divide(BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser, j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue(this.field);
            if (value == null) {
                return false;
            }
            DecimalStyle decimalStyle = dateTimePrintContext.getDecimalStyle();
            BigDecimal convertToFraction = convertToFraction(value.longValue());
            if (convertToFraction.scale() != 0) {
                String convertNumberToI18N = decimalStyle.convertNumberToI18N(convertToFraction.setScale(Math.min(Math.max(convertToFraction.scale(), this.minWidth), this.maxWidth), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.decimalPoint) {
                    sb2.append(decimalStyle.getDecimalSeparator());
                }
                sb2.append(convertNumberToI18N);
                return true;
            } else if (this.minWidth > 0) {
                if (this.decimalPoint) {
                    sb2.append(decimalStyle.getDecimalSeparator());
                }
                for (int i10 = 0; i10 < this.minWidth; i10++) {
                    sb2.append(decimalStyle.getZeroDigit());
                }
                return true;
            } else {
                return true;
            }
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        boolean isFixedWidth(DateTimeParseContext dateTimeParseContext) {
            return dateTimeParseContext.isStrict() && this.minWidth == this.maxWidth && !this.decimalPoint;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser, j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int i11;
            int i12 = 0;
            int i13 = (dateTimeParseContext.isStrict() || isFixedWidth(dateTimeParseContext)) ? this.minWidth : 0;
            int i14 = (dateTimeParseContext.isStrict() || isFixedWidth(dateTimeParseContext)) ? this.maxWidth : 9;
            int length = charSequence.length();
            if (i10 == length) {
                return i13 > 0 ? ~i10 : i10;
            }
            if (this.decimalPoint) {
                if (charSequence.charAt(i10) != dateTimeParseContext.getDecimalStyle().getDecimalSeparator()) {
                    return i13 > 0 ? ~i10 : i10;
                }
                i10++;
            }
            int i15 = i10;
            int i16 = i13 + i15;
            if (i16 > length) {
                return ~i15;
            }
            int min = Math.min(i14 + i15, length);
            int i17 = i15;
            while (true) {
                if (i17 >= min) {
                    i11 = i17;
                    break;
                }
                int i18 = i17 + 1;
                int convertToDigit = dateTimeParseContext.getDecimalStyle().convertToDigit(charSequence.charAt(i17));
                if (convertToDigit >= 0) {
                    i12 = (i12 * 10) + convertToDigit;
                    i17 = i18;
                } else if (i18 < i16) {
                    return ~i15;
                } else {
                    i11 = i18 - 1;
                }
            }
            return dateTimeParseContext.setParsedField(this.field, convertFromFraction(new BigDecimal(i12).movePointLeft(i11 - i15)), i15, i11);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public String toString() {
            String str = this.decimalPoint ? ",DecimalPoint" : "";
            return "Fraction(" + this.field + "," + this.minWidth + "," + this.maxWidth + str + ")";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public FractionPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new FractionPrinterParser(this.field, this.minWidth, this.maxWidth, this.decimalPoint, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public FractionPrinterParser withSubsequentWidth(int i10) {
            return new FractionPrinterParser(this.field, this.minWidth, this.maxWidth, this.decimalPoint, this.subsequentWidth + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class InstantPrinterParser implements DateTimePrinterParser {
        private final int fractionalDigits;

        InstantPrinterParser(int i10) {
            this.fractionalDigits = i10;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue(ChronoField.INSTANT_SECONDS);
            TemporalAccessor temporal = dateTimePrintContext.getTemporal();
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            Long valueOf = temporal.isSupported(chronoField) ? Long.valueOf(dateTimePrintContext.getTemporal().getLong(chronoField)) : null;
            int i10 = 0;
            if (value == null) {
                return false;
            }
            long longValue = value.longValue();
            int checkValidIntValue = chronoField.checkValidIntValue(valueOf != null ? valueOf.longValue() : 0L);
            if (longValue >= -62167219200L) {
                long j10 = (longValue - 315569520000L) + 62167219200L;
                long m10 = DesugarLocalDate$$ExternalSyntheticBackport1.m(j10, 315569520000L) + 1;
                LocalDateTime ofEpochSecond = LocalDateTime.ofEpochSecond(Clock$TickClock$$ExternalSyntheticBackport0.m(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                if (m10 > 0) {
                    sb2.append('+');
                    sb2.append(m10);
                }
                sb2.append(ofEpochSecond);
                if (ofEpochSecond.getSecond() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j11 = longValue + 62167219200L;
                long j12 = j11 / 315569520000L;
                long j13 = j11 % 315569520000L;
                LocalDateTime ofEpochSecond2 = LocalDateTime.ofEpochSecond(j13 - 62167219200L, 0, ZoneOffset.UTC);
                int length = sb2.length();
                sb2.append(ofEpochSecond2);
                if (ofEpochSecond2.getSecond() == 0) {
                    sb2.append(":00");
                }
                if (j12 < 0) {
                    if (ofEpochSecond2.getYear() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j12 - 1));
                    } else if (j13 == 0) {
                        sb2.insert(length, j12);
                    } else {
                        sb2.insert(length + 1, Math.abs(j12));
                    }
                }
            }
            int i11 = this.fractionalDigits;
            if ((i11 < 0 && checkValidIntValue > 0) || i11 > 0) {
                sb2.append('.');
                int i12 = 100000000;
                while (true) {
                    int i13 = this.fractionalDigits;
                    if ((i13 != -1 || checkValidIntValue <= 0) && ((i13 != -2 || (checkValidIntValue <= 0 && i10 % 3 == 0)) && i10 >= i13)) {
                        break;
                    }
                    int i14 = checkValidIntValue / i12;
                    sb2.append((char) (i14 + 48));
                    checkValidIntValue -= i14 * i12;
                    i12 /= 10;
                    i10++;
                }
            }
            sb2.append('Z');
            return true;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int i11;
            int i12;
            int i13 = this.fractionalDigits;
            int i14 = 0;
            int i15 = i13 < 0 ? 0 : i13;
            if (i13 < 0) {
                i13 = 9;
            }
            DateTimeFormatterBuilder appendLiteral = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE).appendLiteral('T');
            ChronoField chronoField = ChronoField.HOUR_OF_DAY;
            DateTimeFormatterBuilder appendLiteral2 = appendLiteral.appendValue(chronoField, 2).appendLiteral(':');
            ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
            DateTimeFormatterBuilder appendLiteral3 = appendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
            ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
            DateTimeFormatterBuilder appendValue = appendLiteral3.appendValue(chronoField3, 2);
            ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
            CompositePrinterParser printerParser = appendValue.appendFraction(chronoField4, i15, i13, true).appendLiteral('Z').toFormatter().toPrinterParser(false);
            DateTimeParseContext copy = dateTimeParseContext.copy();
            int parse = printerParser.parse(copy, charSequence, i10);
            if (parse < 0) {
                return parse;
            }
            long longValue = copy.getParsed(ChronoField.YEAR).longValue();
            int intValue = copy.getParsed(ChronoField.MONTH_OF_YEAR).intValue();
            int intValue2 = copy.getParsed(ChronoField.DAY_OF_MONTH).intValue();
            int intValue3 = copy.getParsed(chronoField).intValue();
            int intValue4 = copy.getParsed(chronoField2).intValue();
            Long parsed = copy.getParsed(chronoField3);
            Long parsed2 = copy.getParsed(chronoField4);
            int intValue5 = parsed != null ? parsed.intValue() : 0;
            int intValue6 = parsed2 != null ? parsed2.intValue() : 0;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i12 = intValue5;
                i14 = 1;
                i11 = 0;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                dateTimeParseContext.setParsedLeapSecond();
                i11 = intValue3;
                i12 = 59;
            } else {
                i11 = intValue3;
                i12 = intValue5;
            }
            try {
                return dateTimeParseContext.setParsedField(chronoField4, intValue6, i10, dateTimeParseContext.setParsedField(ChronoField.INSTANT_SECONDS, Duration$$ExternalSyntheticBackport0.m(longValue / 10000, 315569520000L) + LocalDateTime.of(((int) longValue) % 10000, intValue, intValue2, i11, intValue4, i12, 0).plusDays(i14).toEpochSecond(ZoneOffset.UTC), i10, parse));
            } catch (RuntimeException unused) {
                return ~i10;
            }
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalizedOffsetIdPrinterParser implements DateTimePrinterParser {
        private final TextStyle style;

        LocalizedOffsetIdPrinterParser(TextStyle textStyle) {
            this.style = textStyle;
        }

        private static StringBuilder appendHMS(StringBuilder sb2, int i10) {
            sb2.append((char) ((i10 / 10) + 48));
            sb2.append((char) ((i10 % 10) + 48));
            return sb2;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue(ChronoField.OFFSET_SECONDS);
            if (value == null) {
                return false;
            }
            sb2.append("GMT");
            int m10 = LocalDate$$ExternalSyntheticBackport5.m(value.longValue());
            if (m10 != 0) {
                int abs = Math.abs((m10 / 3600) % 100);
                int abs2 = Math.abs((m10 / 60) % 60);
                int abs3 = Math.abs(m10 % 60);
                sb2.append(m10 < 0 ? "-" : "+");
                if (this.style == TextStyle.FULL) {
                    appendHMS(sb2, abs);
                    sb2.append(':');
                    appendHMS(sb2, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                } else {
                    if (abs >= 10) {
                        sb2.append((char) ((abs / 10) + 48));
                    }
                    sb2.append((char) ((abs % 10) + 48));
                    if (abs2 == 0 && abs3 == 0) {
                        return true;
                    }
                    sb2.append(':');
                    appendHMS(sb2, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                }
                sb2.append(':');
                appendHMS(sb2, abs3);
                return true;
            }
            return true;
        }

        int getDigit(CharSequence charSequence, int i10) {
            char charAt = charSequence.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return -1;
            }
            return charAt - '0';
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        
            if (r13 >= 0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
        
            if (r13 >= 0) goto L66;
         */
        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parse(j$.time.format.DateTimeParseContext r12, java.lang.CharSequence r13, int r14) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.LocalizedOffsetIdPrinterParser.parse(j$.time.format.DateTimeParseContext, java.lang.CharSequence, int):int");
        }

        public String toString() {
            return "LocalizedOffset(" + this.style + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class NumberPrinterParser implements DateTimePrinterParser {
        static final long[] EXCEED_POINTS = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};
        final TemporalField field;
        final int maxWidth;
        final int minWidth;
        private final SignStyle signStyle;
        final int subsequentWidth;

        NumberPrinterParser(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
            this.field = temporalField;
            this.minWidth = i10;
            this.maxWidth = i11;
            this.signStyle = signStyle;
            this.subsequentWidth = 0;
        }

        protected NumberPrinterParser(TemporalField temporalField, int i10, int i11, SignStyle signStyle, int i12) {
            this.field = temporalField;
            this.minWidth = i10;
            this.maxWidth = i11;
            this.signStyle = signStyle;
            this.subsequentWidth = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[LOOP:0: B:35:0x0099->B:37:0x00a2, LOOP_END] */
        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean format(j$.time.format.DateTimePrintContext r12, java.lang.StringBuilder r13) {
            /*
                r11 = this;
                j$.time.temporal.TemporalField r0 = r11.field
                java.lang.Long r0 = r12.getValue(r0)
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                long r2 = r0.longValue()
                long r2 = r11.getValue(r12, r2)
                j$.time.format.DecimalStyle r12 = r12.getDecimalStyle()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1f
                java.lang.String r0 = "9223372036854775808"
                goto L27
            L1f:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L27:
                int r4 = r0.length()
                int r5 = r11.maxWidth
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto Lb0
                java.lang.String r0 = r12.convertNumberToI18N(r0)
                r4 = 0
                r8 = 2
                r9 = 1
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                int[] r4 = j$.time.format.DateTimeFormatterBuilder.AnonymousClass3.$SwitchMap$java$time$format$SignStyle
                j$.time.format.SignStyle r5 = r11.signStyle
                int r5 = r5.ordinal()
                if (r10 < 0) goto L65
                r4 = r4[r5]
                if (r4 == r9) goto L56
                if (r4 == r8) goto L4e
                goto L99
            L4e:
                char r2 = r12.getPositiveSign()
            L52:
                r13.append(r2)
                goto L99
            L56:
                int r4 = r11.minWidth
                r5 = 19
                if (r4 >= r5) goto L99
                long[] r5 = j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser.EXCEED_POINTS
                r4 = r5[r4]
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L99
                goto L4e
            L65:
                r4 = r4[r5]
                if (r4 == r9) goto L94
                if (r4 == r8) goto L94
                r5 = 3
                if (r4 == r5) goto L94
                r5 = 4
                if (r4 == r5) goto L72
                goto L99
            L72:
                j$.time.DateTimeException r12 = new j$.time.DateTimeException
                j$.time.temporal.TemporalField r13 = r11.field
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r13)
                r0.append(r6)
                r0.append(r2)
                java.lang.String r13 = " cannot be negative according to the SignStyle"
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r12.<init>(r13)
                throw r12
            L94:
                char r2 = r12.getNegativeSign()
                goto L52
            L99:
                int r2 = r11.minWidth
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto Lac
                char r2 = r12.getZeroDigit()
                r13.append(r2)
                int r1 = r1 + 1
                goto L99
            Lac:
                r13.append(r0)
                return r9
            Lb0:
                j$.time.DateTimeException r12 = new j$.time.DateTimeException
                j$.time.temporal.TemporalField r13 = r11.field
                int r0 = r11.maxWidth
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r7)
                r1.append(r13)
                r1.append(r6)
                r1.append(r2)
                java.lang.String r13 = " exceeds the maximum print width of "
                r1.append(r13)
                r1.append(r0)
                java.lang.String r13 = r1.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser.format(j$.time.format.DateTimePrintContext, java.lang.StringBuilder):boolean");
        }

        long getValue(DateTimePrintContext dateTimePrintContext, long j10) {
            return j10;
        }

        boolean isFixedWidth(DateTimeParseContext dateTimeParseContext) {
            int i10 = this.subsequentWidth;
            return i10 == -1 || (i10 > 0 && this.minWidth == this.maxWidth && this.signStyle == SignStyle.NOT_NEGATIVE);
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0179  */
        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parse(j$.time.format.DateTimeParseContext r20, java.lang.CharSequence r21, int r22) {
            /*
                Method dump skipped, instructions count: 387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser.parse(j$.time.format.DateTimeParseContext, java.lang.CharSequence, int):int");
        }

        int setValue(DateTimeParseContext dateTimeParseContext, long j10, int i10, int i11) {
            return dateTimeParseContext.setParsedField(this.field, j10, i10, i11);
        }

        public String toString() {
            int i10 = this.minWidth;
            if (i10 == 1 && this.maxWidth == 19 && this.signStyle == SignStyle.NORMAL) {
                return "Value(" + this.field + ")";
            }
            int i11 = this.maxWidth;
            if (i10 == i11 && this.signStyle == SignStyle.NOT_NEGATIVE) {
                return "Value(" + this.field + "," + i10 + ")";
            }
            return "Value(" + this.field + "," + i10 + "," + i11 + "," + this.signStyle + ")";
        }

        NumberPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new NumberPrinterParser(this.field, this.minWidth, this.maxWidth, this.signStyle, -1);
        }

        NumberPrinterParser withSubsequentWidth(int i10) {
            return new NumberPrinterParser(this.field, this.minWidth, this.maxWidth, this.signStyle, this.subsequentWidth + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class OffsetIdPrinterParser implements DateTimePrinterParser {
        private final String noOffsetText;
        private final int style;
        private final int type;
        static final String[] PATTERNS = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
        static final OffsetIdPrinterParser INSTANCE_ID_Z = new OffsetIdPrinterParser("+HH:MM:ss", "Z");
        static final OffsetIdPrinterParser INSTANCE_ID_ZERO = new OffsetIdPrinterParser("+HH:MM:ss", "0");

        OffsetIdPrinterParser(String str, String str2) {
            Objects.requireNonNull(str, "pattern");
            Objects.requireNonNull(str2, "noOffsetText");
            int checkPattern = checkPattern(str);
            this.type = checkPattern;
            this.style = checkPattern % 11;
            this.noOffsetText = str2;
        }

        private int checkPattern(String str) {
            int i10 = 0;
            while (true) {
                String[] strArr = PATTERNS;
                if (i10 >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i10].equals(str)) {
                    return i10;
                } else {
                    i10++;
                }
            }
        }

        private void formatZeroPad(boolean z10, int i10, StringBuilder sb2) {
            sb2.append(z10 ? ":" : "");
            sb2.append((char) ((i10 / 10) + 48));
            sb2.append((char) ((i10 % 10) + 48));
        }

        private boolean isColon() {
            int i10 = this.style;
            return i10 > 0 && i10 % 2 == 0;
        }

        private boolean isPaddedHour() {
            return this.type < 11;
        }

        private boolean parseDigits(CharSequence charSequence, boolean z10, int i10, int[] iArr) {
            int i11;
            int i12 = iArr[0];
            if (i12 < 0) {
                return true;
            }
            if (z10 && i10 != 1) {
                int i13 = i12 + 1;
                if (i13 > charSequence.length() || charSequence.charAt(i12) != ':') {
                    return false;
                }
                i12 = i13;
            }
            if (i12 + 2 > charSequence.length()) {
                return false;
            }
            int i14 = i12 + 1;
            char charAt = charSequence.charAt(i12);
            int i15 = i14 + 1;
            char charAt2 = charSequence.charAt(i14);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i11 = ((charAt - '0') * 10) + (charAt2 - '0')) < 0 || i11 > 59) {
                return false;
            }
            iArr[i10] = i11;
            iArr[0] = i15;
            return true;
        }

        private void parseHour(CharSequence charSequence, boolean z10, int[] iArr) {
            if (!z10) {
                parseVariableWidthDigits(charSequence, 1, 2, iArr);
            } else if (parseDigits(charSequence, false, 1, iArr)) {
            } else {
                iArr[0] = ~iArr[0];
            }
        }

        private void parseMinute(CharSequence charSequence, boolean z10, boolean z11, int[] iArr) {
            if (parseDigits(charSequence, z10, 2, iArr) || !z11) {
                return;
            }
            iArr[0] = ~iArr[0];
        }

        private void parseOptionalMinuteSecond(CharSequence charSequence, boolean z10, int[] iArr) {
            if (parseDigits(charSequence, z10, 2, iArr)) {
                parseDigits(charSequence, z10, 3, iArr);
            }
        }

        private void parseSecond(CharSequence charSequence, boolean z10, boolean z11, int[] iArr) {
            if (parseDigits(charSequence, z10, 3, iArr) || !z11) {
                return;
            }
            iArr[0] = ~iArr[0];
        }

        private void parseVariableWidthDigits(CharSequence charSequence, int i10, int i11, int[] iArr) {
            int i12;
            int i13 = iArr[0];
            char[] cArr = new char[i11];
            int i14 = 0;
            int i15 = 0;
            while (i14 < i11 && (i12 = i13 + 1) <= charSequence.length()) {
                char charAt = charSequence.charAt(i13);
                if (charAt < '0' || charAt > '9') {
                    i13 = i12 - 1;
                    break;
                }
                cArr[i14] = charAt;
                i15++;
                i14++;
                i13 = i12;
            }
            if (i15 < i10) {
                iArr[0] = ~iArr[0];
                return;
            }
            switch (i15) {
                case 1:
                    iArr[1] = cArr[0] - '0';
                    break;
                case 2:
                    iArr[1] = ((cArr[0] - '0') * 10) + (cArr[1] - '0');
                    break;
                case 3:
                    iArr[1] = cArr[0] - '0';
                    iArr[2] = ((cArr[1] - '0') * 10) + (cArr[2] - '0');
                    break;
                case 4:
                    iArr[1] = ((cArr[0] - '0') * 10) + (cArr[1] - '0');
                    iArr[2] = ((cArr[2] - '0') * 10) + (cArr[3] - '0');
                    break;
                case 5:
                    iArr[1] = cArr[0] - '0';
                    iArr[2] = ((cArr[1] - '0') * 10) + (cArr[2] - '0');
                    iArr[3] = ((cArr[3] - '0') * 10) + (cArr[4] - '0');
                    break;
                case 6:
                    iArr[1] = ((cArr[0] - '0') * 10) + (cArr[1] - '0');
                    iArr[2] = ((cArr[2] - '0') * 10) + (cArr[3] - '0');
                    iArr[3] = ((cArr[4] - '0') * 10) + (cArr[5] - '0');
                    break;
            }
            iArr[0] = i13;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue(ChronoField.OFFSET_SECONDS);
            if (value == null) {
                return false;
            }
            int m10 = LocalDate$$ExternalSyntheticBackport5.m(value.longValue());
            if (m10 != 0) {
                int abs = Math.abs((m10 / 3600) % 100);
                int abs2 = Math.abs((m10 / 60) % 60);
                int abs3 = Math.abs(m10 % 60);
                int length = sb2.length();
                sb2.append(m10 < 0 ? "-" : "+");
                if (isPaddedHour() || abs >= 10) {
                    formatZeroPad(false, abs, sb2);
                } else {
                    sb2.append((char) (abs + 48));
                }
                int i10 = this.style;
                if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && abs3 > 0) || (i10 >= 1 && abs2 > 0))) {
                    formatZeroPad(isColon(), abs2, sb2);
                    abs += abs2;
                    int i11 = this.style;
                    if (i11 == 7 || i11 == 8 || (i11 >= 5 && abs3 > 0)) {
                        formatZeroPad(isColon(), abs3, sb2);
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb2.setLength(length);
                }
                return true;
            }
            sb2.append(this.noOffsetText);
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
        
            if (r18 == r9) goto L5;
         */
        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parse(j$.time.format.DateTimeParseContext r16, java.lang.CharSequence r17, int r18) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.OffsetIdPrinterParser.parse(j$.time.format.DateTimeParseContext, java.lang.CharSequence, int):int");
        }

        public String toString() {
            String replace = this.noOffsetText.replace("'", "''");
            return "Offset(" + PATTERNS[this.type] + ",'" + replace + "')";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PadPrinterParserDecorator implements DateTimePrinterParser {
        private final char padChar;
        private final int padWidth;
        private final DateTimePrinterParser printerParser;

        PadPrinterParserDecorator(DateTimePrinterParser dateTimePrinterParser, int i10, char c10) {
            this.printerParser = dateTimePrinterParser;
            this.padWidth = i10;
            this.padChar = c10;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            int length = sb2.length();
            if (this.printerParser.format(dateTimePrintContext, sb2)) {
                int length2 = sb2.length() - length;
                if (length2 <= this.padWidth) {
                    for (int i10 = 0; i10 < this.padWidth - length2; i10++) {
                        sb2.insert(length, this.padChar);
                    }
                    return true;
                }
                throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.padWidth);
            }
            return false;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            boolean isStrict = dateTimeParseContext.isStrict();
            if (i10 <= charSequence.length()) {
                if (i10 == charSequence.length()) {
                    return ~i10;
                }
                int i11 = this.padWidth + i10;
                if (i11 > charSequence.length()) {
                    if (isStrict) {
                        return ~i10;
                    }
                    i11 = charSequence.length();
                }
                int i12 = i10;
                while (i12 < i11 && dateTimeParseContext.charEquals(charSequence.charAt(i12), this.padChar)) {
                    i12++;
                }
                int parse = this.printerParser.parse(dateTimeParseContext, charSequence.subSequence(0, i11), i12);
                return (parse == i11 || !isStrict) ? parse : ~(i10 + i12);
            }
            throw new IndexOutOfBoundsException();
        }

        public String toString() {
            String str;
            DateTimePrinterParser dateTimePrinterParser = this.printerParser;
            int i10 = this.padWidth;
            char c10 = this.padChar;
            if (c10 == ' ') {
                str = ")";
            } else {
                str = ",'" + c10 + "')";
            }
            return "Pad(" + dateTimePrinterParser + "," + i10 + str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class PrefixTree {

        /* renamed from: c0  reason: collision with root package name */
        protected char f18471c0;
        protected PrefixTree child;
        protected String key;
        protected PrefixTree sibling;
        protected String value;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class CI extends PrefixTree {
            private CI(String str, String str2, PrefixTree prefixTree) {
                super(str, str2, prefixTree);
            }

            @Override // j$.time.format.DateTimeFormatterBuilder.PrefixTree
            protected boolean isEqual(char c10, char c11) {
                return DateTimeParseContext.charEqualsIgnoreCase(c10, c11);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // j$.time.format.DateTimeFormatterBuilder.PrefixTree
            public CI newNode(String str, String str2, PrefixTree prefixTree) {
                return new CI(str, str2, prefixTree);
            }

            @Override // j$.time.format.DateTimeFormatterBuilder.PrefixTree
            protected boolean prefixOf(CharSequence charSequence, int i10, int i11) {
                int length = this.key.length();
                if (length > i11 - i10) {
                    return false;
                }
                int i12 = 0;
                while (true) {
                    int i13 = length - 1;
                    if (length <= 0) {
                        return true;
                    }
                    int i14 = i12 + 1;
                    int i15 = i10 + 1;
                    if (!isEqual(this.key.charAt(i12), charSequence.charAt(i10))) {
                        return false;
                    }
                    i10 = i15;
                    length = i13;
                    i12 = i14;
                }
            }
        }

        private PrefixTree(String str, String str2, PrefixTree prefixTree) {
            this.key = str;
            this.value = str2;
            this.child = prefixTree;
            this.f18471c0 = str.isEmpty() ? (char) 65535 : this.key.charAt(0);
        }

        private boolean add0(String str, String str2) {
            String key = toKey(str);
            int prefixLength = prefixLength(key);
            if (prefixLength != this.key.length()) {
                PrefixTree newNode = newNode(this.key.substring(prefixLength), this.value, this.child);
                this.key = key.substring(0, prefixLength);
                this.child = newNode;
                if (prefixLength < key.length()) {
                    this.child.sibling = newNode(key.substring(prefixLength), str2, null);
                    this.value = null;
                } else {
                    this.value = str2;
                }
                return true;
            } else if (prefixLength >= key.length()) {
                this.value = str2;
                return true;
            } else {
                String substring = key.substring(prefixLength);
                for (PrefixTree prefixTree = this.child; prefixTree != null; prefixTree = prefixTree.sibling) {
                    if (isEqual(prefixTree.f18471c0, substring.charAt(0))) {
                        return prefixTree.add0(substring, str2);
                    }
                }
                PrefixTree newNode2 = newNode(substring, str2, null);
                newNode2.sibling = this.child;
                this.child = newNode2;
                return true;
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.format.DateTimeFormatterBuilder$PrefixTree, java.lang.String, j$.time.format.DateTimeFormatterBuilder$PrefixTree$CI-IA] */
        public static PrefixTree newTree(DateTimeParseContext dateTimeParseContext) {
            ?? r12 = 0;
            return dateTimeParseContext.isCaseSensitive() ? new PrefixTree("", null, null) : new CI("", r12, r12);
        }

        public static PrefixTree newTree(Set set, DateTimeParseContext dateTimeParseContext) {
            PrefixTree newTree = newTree(dateTimeParseContext);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                newTree.add0(str, str);
            }
            return newTree;
        }

        private int prefixLength(String str) {
            int i10 = 0;
            while (i10 < str.length() && i10 < this.key.length() && isEqual(str.charAt(i10), this.key.charAt(i10))) {
                i10++;
            }
            return i10;
        }

        public boolean add(String str, String str2) {
            return add0(str, str2);
        }

        protected boolean isEqual(char c10, char c11) {
            return c10 == c11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            if (isEqual(r2.f18471c0, r5.charAt(r0)) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            r6.setIndex(r0);
            r5 = r2.match(r5, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            if (r5 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            r2 = r2.sibling;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            if (r2 != null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            if (r0 != r1) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String match(java.lang.CharSequence r5, java.text.ParsePosition r6) {
            /*
                r4 = this;
                int r0 = r6.getIndex()
                int r1 = r5.length()
                boolean r2 = r4.prefixOf(r5, r0, r1)
                if (r2 != 0) goto L10
                r5 = 0
                return r5
            L10:
                java.lang.String r2 = r4.key
                int r2 = r2.length()
                int r0 = r0 + r2
                j$.time.format.DateTimeFormatterBuilder$PrefixTree r2 = r4.child
                if (r2 == 0) goto L37
                if (r0 == r1) goto L37
            L1d:
                char r1 = r2.f18471c0
                char r3 = r5.charAt(r0)
                boolean r1 = r4.isEqual(r1, r3)
                if (r1 == 0) goto L33
                r6.setIndex(r0)
                java.lang.String r5 = r2.match(r5, r6)
                if (r5 == 0) goto L37
                return r5
            L33:
                j$.time.format.DateTimeFormatterBuilder$PrefixTree r2 = r2.sibling
                if (r2 != 0) goto L1d
            L37:
                r6.setIndex(r0)
                java.lang.String r5 = r4.value
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.PrefixTree.match(java.lang.CharSequence, java.text.ParsePosition):java.lang.String");
        }

        protected PrefixTree newNode(String str, String str2, PrefixTree prefixTree) {
            return new PrefixTree(str, str2, prefixTree);
        }

        protected boolean prefixOf(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof String) {
                return ((String) charSequence).startsWith(this.key, i10);
            }
            int length = this.key.length();
            if (length > i11 - i10) {
                return false;
            }
            int i12 = 0;
            while (true) {
                int i13 = length - 1;
                if (length <= 0) {
                    return true;
                }
                int i14 = i12 + 1;
                int i15 = i10 + 1;
                if (!isEqual(this.key.charAt(i12), charSequence.charAt(i10))) {
                    return false;
                }
                i10 = i15;
                length = i13;
                i12 = i14;
            }
        }

        protected String toKey(String str) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ReducedPrinterParser extends NumberPrinterParser {
        static final LocalDate BASE_DATE = LocalDate.of((int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 1, 1);
        private final ChronoLocalDate baseDate;
        private final int baseValue;

        ReducedPrinterParser(TemporalField temporalField, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate) {
            this(temporalField, i10, i11, i12, chronoLocalDate, 0);
            if (i10 < 1 || i10 > 10) {
                throw new IllegalArgumentException("The minWidth must be from 1 to 10 inclusive but was " + i10);
            } else if (i11 < 1 || i11 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i10);
            } else if (i11 < i10) {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
            } else if (chronoLocalDate == null) {
                long j10 = i12;
                if (!temporalField.range().isValidValue(j10)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                }
                if (j10 + NumberPrinterParser.EXCEED_POINTS[i11] > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
        }

        private ReducedPrinterParser(TemporalField temporalField, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13) {
            super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i13);
            this.baseValue = i12;
            this.baseDate = chronoLocalDate;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        long getValue(DateTimePrintContext dateTimePrintContext, long j10) {
            long abs = Math.abs(j10);
            int i10 = this.baseValue;
            if (this.baseDate != null) {
                i10 = Chronology.CC.from(dateTimePrintContext.getTemporal()).date(this.baseDate).get(this.field);
            }
            long j11 = i10;
            if (j10 >= j11) {
                long j12 = NumberPrinterParser.EXCEED_POINTS[this.minWidth];
                if (j10 < j11 + j12) {
                    return abs % j12;
                }
            }
            return abs % NumberPrinterParser.EXCEED_POINTS[this.maxWidth];
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        boolean isFixedWidth(DateTimeParseContext dateTimeParseContext) {
            if (dateTimeParseContext.isStrict()) {
                return super.isFixedWidth(dateTimeParseContext);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$setValue$0$java-time-format-DateTimeFormatterBuilder$ReducedPrinterParser  reason: not valid java name */
        public /* synthetic */ void m191xdf3a601e(DateTimeParseContext dateTimeParseContext, long j10, int i10, int i11, Chronology chronology) {
            setValue(dateTimeParseContext, j10, i10, i11);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        int setValue(final DateTimeParseContext dateTimeParseContext, final long j10, final int i10, final int i11) {
            int i12 = this.baseValue;
            if (this.baseDate != null) {
                i12 = dateTimeParseContext.getEffectiveChronology().date(this.baseDate).get(this.field);
                dateTimeParseContext.addChronoChangedListener(new Consumer() { // from class: j$.time.format.DateTimeFormatterBuilder$ReducedPrinterParser$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        DateTimeFormatterBuilder.ReducedPrinterParser.this.m191xdf3a601e(dateTimeParseContext, j10, i10, i11, (Chronology) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            int i13 = i11 - i10;
            int i14 = this.minWidth;
            if (i13 == i14 && j10 >= 0) {
                long j11 = NumberPrinterParser.EXCEED_POINTS[i14];
                long j12 = i12;
                long j13 = j12 - (j12 % j11);
                j10 = i12 > 0 ? j13 + j10 : j13 - j10;
                if (j10 < j12) {
                    j10 += j11;
                }
            }
            return dateTimeParseContext.setParsedField(this.field, j10, i10, i11);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public String toString() {
            return "ReducedValue(" + this.field + "," + this.minWidth + "," + this.maxWidth + "," + Objects.requireNonNullElse(this.baseDate, Integer.valueOf(this.baseValue)) + ")";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public ReducedPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new ReducedPrinterParser(this.field, this.minWidth, this.maxWidth, this.baseValue, this.baseDate, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public ReducedPrinterParser withSubsequentWidth(int i10) {
            return new ReducedPrinterParser(this.field, this.minWidth, this.maxWidth, this.baseValue, this.baseDate, this.subsequentWidth + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum SettingsParser implements DateTimePrinterParser {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            return true;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                dateTimeParseContext.setCaseSensitive(true);
            } else if (ordinal == 1) {
                dateTimeParseContext.setCaseSensitive(false);
            } else if (ordinal == 2) {
                dateTimeParseContext.setStrict(true);
            } else if (ordinal == 3) {
                dateTimeParseContext.setStrict(false);
            }
            return i10;
        }

        @Override // java.lang.Enum
        public String toString() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return "ParseStrict(false)";
                        }
                        throw new IllegalStateException("Unreachable");
                    }
                    return "ParseStrict(true)";
                }
                return "ParseCaseSensitive(false)";
            }
            return "ParseCaseSensitive(true)";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StringLiteralPrinterParser implements DateTimePrinterParser {
        private final String literal;

        StringLiteralPrinterParser(String str) {
            this.literal = str;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            sb2.append(this.literal);
            return true;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            if (i10 > charSequence.length() || i10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.literal;
            return !dateTimeParseContext.subSequenceEquals(charSequence, i10, str, 0, str.length()) ? ~i10 : i10 + this.literal.length();
        }

        public String toString() {
            return "'" + this.literal.replace("'", "''") + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TextPrinterParser implements DateTimePrinterParser {
        private final TemporalField field;
        private volatile NumberPrinterParser numberPrinterParser;
        private final DateTimeTextProvider provider;
        private final TextStyle textStyle;

        TextPrinterParser(TemporalField temporalField, TextStyle textStyle, DateTimeTextProvider dateTimeTextProvider) {
            this.field = temporalField;
            this.textStyle = textStyle;
            this.provider = dateTimeTextProvider;
        }

        private NumberPrinterParser numberPrinterParser() {
            if (this.numberPrinterParser == null) {
                this.numberPrinterParser = new NumberPrinterParser(this.field, 1, 19, SignStyle.NORMAL);
            }
            return this.numberPrinterParser;
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            Long value = dateTimePrintContext.getValue(this.field);
            if (value == null) {
                return false;
            }
            Chronology chronology = (Chronology) dateTimePrintContext.getTemporal().query(TemporalQueries.chronology());
            String text = (chronology == null || chronology == IsoChronology.INSTANCE) ? this.provider.getText(this.field, value.longValue(), this.textStyle, dateTimePrintContext.getLocale()) : this.provider.getText(chronology, this.field, value.longValue(), this.textStyle, dateTimePrintContext.getLocale());
            if (text == null) {
                return numberPrinterParser().format(dateTimePrintContext, sb2);
            }
            sb2.append(text);
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        
            if (r7 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r7.hasNext() == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            r8 = (java.util.Map.Entry) r7.next();
            r9 = (java.lang.String) r8.getKey();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (r11.subSequenceEquals(r9, 0, r12, r13, r9.length()) == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        
            return r11.setParsedField(r10.field, ((java.lang.Long) r8.getValue()).longValue(), r13, r13 + r9.length());
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r10.field != j$.time.temporal.ChronoField.ERA) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        
            if (r11.isStrict() != false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
        
            r6 = r6.eras().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        
            if (r6.hasNext() == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        
            r8 = ((j$.time.chrono.Era) r6.next()).toString();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        
            if (r11.subSequenceEquals(r8, 0, r12, r13, r8.length()) == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
        
            return r11.setParsedField(r10.field, r7.getValue(), r13, r13 + r8.length());
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        
            if (r11.isStrict() == false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
        
            return ~r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
        
            return numberPrinterParser().parse(r11, r12, r13);
         */
        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int parse(j$.time.format.DateTimeParseContext r11, java.lang.CharSequence r12, int r13) {
            /*
                r10 = this;
                int r0 = r12.length()
                if (r13 < 0) goto Lce
                if (r13 > r0) goto Lce
                boolean r0 = r11.isStrict()
                if (r0 == 0) goto L11
                j$.time.format.TextStyle r0 = r10.textStyle
                goto L12
            L11:
                r0 = 0
            L12:
                j$.time.chrono.Chronology r6 = r11.getEffectiveChronology()
                if (r6 == 0) goto L2a
                j$.time.chrono.IsoChronology r1 = j$.time.chrono.IsoChronology.INSTANCE
                if (r6 != r1) goto L1d
                goto L2a
            L1d:
                j$.time.format.DateTimeTextProvider r1 = r10.provider
                j$.time.temporal.TemporalField r2 = r10.field
                java.util.Locale r3 = r11.getLocale()
                java.util.Iterator r0 = r1.getTextIterator(r6, r2, r0, r3)
                goto L36
            L2a:
                j$.time.format.DateTimeTextProvider r1 = r10.provider
                j$.time.temporal.TemporalField r2 = r10.field
                java.util.Locale r3 = r11.getLocale()
                java.util.Iterator r0 = r1.getTextIterator(r2, r0, r3)
            L36:
                r7 = r0
                if (r7 == 0) goto Lc5
            L39:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L75
                java.lang.Object r0 = r7.next()
                r8 = r0
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                java.lang.Object r0 = r8.getKey()
                r9 = r0
                java.lang.String r9 = (java.lang.String) r9
                r2 = 0
                int r5 = r9.length()
                r0 = r11
                r1 = r9
                r3 = r12
                r4 = r13
                boolean r0 = r0.subSequenceEquals(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L39
                j$.time.temporal.TemporalField r1 = r10.field
                java.lang.Object r0 = r8.getValue()
                java.lang.Long r0 = (java.lang.Long) r0
                long r2 = r0.longValue()
                int r0 = r9.length()
                int r5 = r13 + r0
                r0 = r11
                r4 = r13
                int r0 = r0.setParsedField(r1, r2, r4, r5)
                return r0
            L75:
                j$.time.temporal.TemporalField r0 = r10.field
                j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.ERA
                if (r0 != r1) goto Lbd
                boolean r0 = r11.isStrict()
                if (r0 != 0) goto Lbd
                java.util.List r0 = r6.eras()
                java.util.Iterator r6 = r0.iterator()
            L89:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto Lbd
                java.lang.Object r0 = r6.next()
                r7 = r0
                j$.time.chrono.Era r7 = (j$.time.chrono.Era) r7
                java.lang.String r8 = r7.toString()
                r2 = 0
                int r5 = r8.length()
                r0 = r11
                r1 = r8
                r3 = r12
                r4 = r13
                boolean r0 = r0.subSequenceEquals(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L89
                j$.time.temporal.TemporalField r1 = r10.field
                int r0 = r7.getValue()
                long r2 = (long) r0
                int r0 = r8.length()
                int r5 = r13 + r0
                r0 = r11
                r4 = r13
                int r0 = r0.setParsedField(r1, r2, r4, r5)
                return r0
            Lbd:
                boolean r0 = r11.isStrict()
                if (r0 == 0) goto Lc5
                int r0 = ~r13
                return r0
            Lc5:
                j$.time.format.DateTimeFormatterBuilder$NumberPrinterParser r0 = r10.numberPrinterParser()
                int r0 = r0.parse(r11, r12, r13)
                return r0
            Lce:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.TextPrinterParser.parse(j$.time.format.DateTimeParseContext, java.lang.CharSequence, int):int");
        }

        public String toString() {
            TextStyle textStyle = this.textStyle;
            if (textStyle == TextStyle.FULL) {
                return "Text(" + this.field + ")";
            }
            return "Text(" + this.field + "," + textStyle + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class WeekBasedFieldPrinterParser extends NumberPrinterParser {
        private char chr;
        private int count;

        WeekBasedFieldPrinterParser(char c10, int i10, int i11, int i12) {
            this(c10, i10, i11, i12, 0);
        }

        WeekBasedFieldPrinterParser(char c10, int i10, int i11, int i12, int i13) {
            super(null, i11, i12, SignStyle.NOT_NEGATIVE, i13);
            this.chr = c10;
            this.count = i10;
        }

        private DateTimePrinterParser printerParser(Locale locale) {
            TemporalField weekOfMonth;
            WeekFields of = WeekFields.of(locale);
            char c10 = this.chr;
            if (c10 == 'W') {
                weekOfMonth = of.weekOfMonth();
            } else if (c10 == 'Y') {
                TemporalField weekBasedYear = of.weekBasedYear();
                int i10 = this.count;
                if (i10 == 2) {
                    return new ReducedPrinterParser(weekBasedYear, 2, 2, 0, ReducedPrinterParser.BASE_DATE, this.subsequentWidth);
                }
                return new NumberPrinterParser(weekBasedYear, i10, 19, i10 < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.subsequentWidth);
            } else if (c10 == 'c' || c10 == 'e') {
                weekOfMonth = of.dayOfWeek();
            } else if (c10 != 'w') {
                throw new IllegalStateException("unreachable");
            } else {
                weekOfMonth = of.weekOfWeekBasedYear();
            }
            return new NumberPrinterParser(weekOfMonth, this.minWidth, this.maxWidth, SignStyle.NOT_NEGATIVE, this.subsequentWidth);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser, j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            return printerParser(dateTimePrintContext.getLocale()).format(dateTimePrintContext, sb2);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser, j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            return printerParser(dateTimeParseContext.getLocale()).parse(dateTimeParseContext, charSequence, i10);
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public String toString() {
            String str;
            String str2;
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Localized(");
            char c10 = this.chr;
            if (c10 == 'Y') {
                int i10 = this.count;
                if (i10 == 1) {
                    str2 = "WeekBasedYear";
                } else if (i10 == 2) {
                    str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
                } else {
                    sb2.append("WeekBasedYear,");
                    sb2.append(this.count);
                    sb2.append(",");
                    sb2.append(19);
                    sb2.append(",");
                    sb2.append(this.count < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                }
                sb2.append(str2);
            } else {
                if (c10 == 'W') {
                    str = "WeekOfMonth";
                } else if (c10 == 'c' || c10 == 'e') {
                    str = "DayOfWeek";
                } else {
                    if (c10 == 'w') {
                        str = "WeekOfWeekBasedYear";
                    }
                    sb2.append(",");
                    sb2.append(this.count);
                }
                sb2.append(str);
                sb2.append(",");
                sb2.append(this.count);
            }
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public WeekBasedFieldPrinterParser withFixedWidth() {
            return this.subsequentWidth == -1 ? this : new WeekBasedFieldPrinterParser(this.chr, this.count, this.minWidth, this.maxWidth, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j$.time.format.DateTimeFormatterBuilder.NumberPrinterParser
        public WeekBasedFieldPrinterParser withSubsequentWidth(int i10) {
            return new WeekBasedFieldPrinterParser(this.chr, this.count, this.minWidth, this.maxWidth, this.subsequentWidth + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ZoneIdPrinterParser implements DateTimePrinterParser {
        private static volatile Map.Entry cachedPrefixTree;
        private static volatile Map.Entry cachedPrefixTreeCI;
        private final String description;
        private final TemporalQuery query;

        ZoneIdPrinterParser(TemporalQuery temporalQuery, String str) {
            this.query = temporalQuery;
            this.description = str;
        }

        private int parseOffsetBased(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10, int i11, OffsetIdPrinterParser offsetIdPrinterParser) {
            String upperCase = charSequence.subSequence(i10, i11).toString().toUpperCase();
            if (i11 >= charSequence.length() || charSequence.charAt(i11) == '0' || dateTimeParseContext.charEquals(charSequence.charAt(i11), 'Z')) {
                dateTimeParseContext.setParsed(ZoneId.of(upperCase));
                return i11;
            }
            DateTimeParseContext copy = dateTimeParseContext.copy();
            int parse = offsetIdPrinterParser.parse(copy, charSequence, i11);
            try {
                if (parse >= 0) {
                    dateTimeParseContext.setParsed(ZoneId.ofOffset(upperCase, ZoneOffset.ofTotalSeconds((int) copy.getParsed(ChronoField.OFFSET_SECONDS).longValue())));
                    return parse;
                } else if (offsetIdPrinterParser == OffsetIdPrinterParser.INSTANCE_ID_Z) {
                    return ~i10;
                } else {
                    dateTimeParseContext.setParsed(ZoneId.of(upperCase));
                    return i11;
                }
            } catch (DateTimeException unused) {
                return ~i10;
            }
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public boolean format(DateTimePrintContext dateTimePrintContext, StringBuilder sb2) {
            ZoneId zoneId = (ZoneId) dateTimePrintContext.getValue(this.query);
            if (zoneId == null) {
                return false;
            }
            sb2.append(zoneId.getId());
            return true;
        }

        protected PrefixTree getTree(DateTimeParseContext dateTimeParseContext) {
            Set availableZoneIds = ZoneRulesProvider.getAvailableZoneIds();
            int size = availableZoneIds.size();
            Map.Entry entry = dateTimeParseContext.isCaseSensitive() ? cachedPrefixTree : cachedPrefixTreeCI;
            if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                synchronized (this) {
                    entry = dateTimeParseContext.isCaseSensitive() ? cachedPrefixTree : cachedPrefixTreeCI;
                    if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                        entry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), PrefixTree.newTree(availableZoneIds, dateTimeParseContext));
                        if (dateTimeParseContext.isCaseSensitive()) {
                            cachedPrefixTree = entry;
                        } else {
                            cachedPrefixTreeCI = entry;
                        }
                    }
                }
            }
            return (PrefixTree) entry.getValue();
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        public int parse(DateTimeParseContext dateTimeParseContext, CharSequence charSequence, int i10) {
            int i11;
            int length = charSequence.length();
            if (i10 <= length) {
                if (i10 == length) {
                    return ~i10;
                }
                char charAt = charSequence.charAt(i10);
                if (charAt == '+' || charAt == '-') {
                    return parseOffsetBased(dateTimeParseContext, charSequence, i10, i10, OffsetIdPrinterParser.INSTANCE_ID_Z);
                }
                int i12 = i10 + 2;
                if (length >= i12) {
                    char charAt2 = charSequence.charAt(i10 + 1);
                    if (dateTimeParseContext.charEquals(charAt, 'U') && dateTimeParseContext.charEquals(charAt2, 'T')) {
                        int i13 = i10 + 3;
                        return (length < i13 || !dateTimeParseContext.charEquals(charSequence.charAt(i12), 'C')) ? parseOffsetBased(dateTimeParseContext, charSequence, i10, i12, OffsetIdPrinterParser.INSTANCE_ID_ZERO) : parseOffsetBased(dateTimeParseContext, charSequence, i10, i13, OffsetIdPrinterParser.INSTANCE_ID_ZERO);
                    } else if (dateTimeParseContext.charEquals(charAt, 'G') && length >= (i11 = i10 + 3) && dateTimeParseContext.charEquals(charAt2, 'M') && dateTimeParseContext.charEquals(charSequence.charAt(i12), 'T')) {
                        int i14 = i10 + 4;
                        if (length < i14 || !dateTimeParseContext.charEquals(charSequence.charAt(i11), '0')) {
                            return parseOffsetBased(dateTimeParseContext, charSequence, i10, i11, OffsetIdPrinterParser.INSTANCE_ID_ZERO);
                        }
                        dateTimeParseContext.setParsed(ZoneId.of("GMT0"));
                        return i14;
                    }
                }
                PrefixTree tree = getTree(dateTimeParseContext);
                ParsePosition parsePosition = new ParsePosition(i10);
                String match = tree.match(charSequence, parsePosition);
                if (match != null) {
                    dateTimeParseContext.setParsed(ZoneId.of(match));
                    return parsePosition.getIndex();
                } else if (dateTimeParseContext.charEquals(charAt, 'Z')) {
                    dateTimeParseContext.setParsed(ZoneOffset.UTC);
                    return i10 + 1;
                } else {
                    return ~i10;
                }
            }
            throw new IndexOutOfBoundsException();
        }

        public String toString() {
            return this.description;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ZoneTextPrinterParser extends ZoneIdPrinterParser {
        private static final Map cache = new ConcurrentHashMap();
        private final Map cachedTree;
        private final Map cachedTreeCI;
        private final boolean isGeneric;
        private Set preferredZones;
        private final TextStyle textStyle;

        ZoneTextPrinterParser(TextStyle textStyle, Set set, boolean z10) {
            super(TemporalQueries.zone(), "ZoneText(" + textStyle + ")");
            this.cachedTree = new HashMap();
            this.cachedTreeCI = new HashMap();
            this.textStyle = (TextStyle) Objects.requireNonNull(textStyle, "textStyle");
            this.isGeneric = z10;
            if (set == null || set.size() == 0) {
                return;
            }
            this.preferredZones = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.preferredZones.add(((ZoneId) it.next()).getId());
            }
        }

        private String getDisplayName(String str, int i10, Locale locale) {
            String[] strArr;
            Map map = null;
            if (this.textStyle == TextStyle.NARROW) {
                return null;
            }
            Map map2 = cache;
            SoftReference softReference = (SoftReference) map2.get(str);
            if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(locale)) == null) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                strArr = new String[]{str, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), str, str};
                if (map == null) {
                    map = new ConcurrentHashMap();
                }
                map.put(locale, strArr);
                map2.put(str, new SoftReference(map));
            }
            int zoneNameStyleIndex = this.textStyle.zoneNameStyleIndex();
            return i10 != 0 ? i10 != 1 ? strArr[zoneNameStyleIndex + 5] : strArr[zoneNameStyleIndex + 3] : strArr[zoneNameStyleIndex + 1];
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        @Override // j$.time.format.DateTimeFormatterBuilder.ZoneIdPrinterParser, j$.time.format.DateTimeFormatterBuilder.DateTimePrinterParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean format(j$.time.format.DateTimePrintContext r8, java.lang.StringBuilder r9) {
            /*
                r7 = this;
                j$.time.temporal.TemporalQuery r0 = j$.time.temporal.TemporalQueries.zoneId()
                java.lang.Object r0 = r8.getValue(r0)
                j$.time.ZoneId r0 = (j$.time.ZoneId) r0
                if (r0 != 0) goto Le
                r8 = 0
                return r8
            Le:
                java.lang.String r1 = r0.getId()
                boolean r2 = r0 instanceof j$.time.ZoneOffset
                if (r2 != 0) goto L7e
                j$.time.temporal.TemporalAccessor r2 = r8.getTemporal()
                boolean r3 = r7.isGeneric
                if (r3 != 0) goto L72
                j$.time.temporal.ChronoField r3 = j$.time.temporal.ChronoField.INSTANT_SECONDS
                boolean r3 = r2.isSupported(r3)
                if (r3 == 0) goto L33
                j$.time.zone.ZoneRules r0 = r0.getRules()
                j$.time.Instant r2 = j$.time.Instant.from(r2)
                boolean r0 = r0.isDaylightSavings(r2)
                goto L73
            L33:
                j$.time.temporal.ChronoField r3 = j$.time.temporal.ChronoField.EPOCH_DAY
                boolean r4 = r2.isSupported(r3)
                if (r4 == 0) goto L72
                j$.time.temporal.ChronoField r4 = j$.time.temporal.ChronoField.NANO_OF_DAY
                boolean r5 = r2.isSupported(r4)
                if (r5 == 0) goto L72
                long r5 = r2.getLong(r3)
                j$.time.LocalDate r3 = j$.time.LocalDate.ofEpochDay(r5)
                long r4 = r2.getLong(r4)
                j$.time.LocalTime r2 = j$.time.LocalTime.ofNanoOfDay(r4)
                j$.time.LocalDateTime r2 = r3.atTime(r2)
                j$.time.zone.ZoneRules r3 = r0.getRules()
                j$.time.zone.ZoneOffsetTransition r3 = r3.getTransition(r2)
                if (r3 != 0) goto L72
                j$.time.zone.ZoneRules r3 = r0.getRules()
                j$.time.ZonedDateTime r0 = r2.atZone(r0)
                j$.time.Instant r0 = r0.toInstant()
                boolean r0 = r3.isDaylightSavings(r0)
                goto L73
            L72:
                r0 = 2
            L73:
                java.util.Locale r8 = r8.getLocale()
                java.lang.String r8 = r7.getDisplayName(r1, r0, r8)
                if (r8 == 0) goto L7e
                r1 = r8
            L7e:
                r9.append(r1)
                r8 = 1
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.ZoneTextPrinterParser.format(j$.time.format.DateTimePrintContext, java.lang.StringBuilder):boolean");
        }

        @Override // j$.time.format.DateTimeFormatterBuilder.ZoneIdPrinterParser
        protected PrefixTree getTree(DateTimeParseContext dateTimeParseContext) {
            PrefixTree newTree;
            if (this.textStyle == TextStyle.NARROW) {
                return super.getTree(dateTimeParseContext);
            }
            Locale locale = dateTimeParseContext.getLocale();
            boolean isCaseSensitive = dateTimeParseContext.isCaseSensitive();
            Set availableZoneIds = ZoneRulesProvider.getAvailableZoneIds();
            int size = availableZoneIds.size();
            Map map = isCaseSensitive ? this.cachedTree : this.cachedTreeCI;
            Map.Entry entry = (Map.Entry) map.get(locale);
            if (entry == null || ((Integer) entry.getKey()).intValue() != size || (newTree = (PrefixTree) ((SoftReference) entry.getValue()).get()) == null) {
                newTree = PrefixTree.newTree(dateTimeParseContext);
                String[][] zoneStrings = DateFormatSymbols.getInstance(locale).getZoneStrings();
                int length = zoneStrings.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    String[] strArr = zoneStrings[i10];
                    String str = strArr[0];
                    if (availableZoneIds.contains(str)) {
                        newTree.add(str, str);
                        String zid = ZoneName.toZid(str, locale);
                        for (int i11 = this.textStyle != TextStyle.FULL ? 2 : 1; i11 < strArr.length; i11 += 2) {
                            newTree.add(strArr[i11], zid);
                        }
                    }
                    i10++;
                }
                if (this.preferredZones != null) {
                    for (String[] strArr2 : zoneStrings) {
                        String str2 = strArr2[0];
                        if (this.preferredZones.contains(str2) && availableZoneIds.contains(str2)) {
                            for (int i12 = this.textStyle == TextStyle.FULL ? 1 : 2; i12 < strArr2.length; i12 += 2) {
                                newTree.add(strArr2[i12], str2);
                            }
                        }
                    }
                }
                map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(newTree)));
            }
            return newTree;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        FIELD_MAP = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        TemporalField temporalField = IsoFields.QUARTER_OF_YEAR;
        hashMap.put('Q', temporalField);
        hashMap.put('q', temporalField);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
        hashMap.put('g', JulianFields.MODIFIED_JULIAN_DAY);
        LENGTH_SORT = new Comparator() { // from class: j$.time.format.DateTimeFormatterBuilder.2
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
            }
        };
    }

    public DateTimeFormatterBuilder() {
        this.active = this;
        this.printerParsers = new ArrayList();
        this.valueParserIndex = -1;
        this.parent = null;
        this.optional = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z10) {
        this.active = this;
        this.printerParsers = new ArrayList();
        this.valueParserIndex = -1;
        this.parent = dateTimeFormatterBuilder;
        this.optional = z10;
    }

    private int appendInternal(DateTimePrinterParser dateTimePrinterParser) {
        Objects.requireNonNull(dateTimePrinterParser, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        int i10 = dateTimeFormatterBuilder.padNextWidth;
        if (i10 > 0) {
            if (dateTimePrinterParser != null) {
                dateTimePrinterParser = new PadPrinterParserDecorator(dateTimePrinterParser, i10, dateTimeFormatterBuilder.padNextChar);
            }
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.active;
            dateTimeFormatterBuilder2.padNextWidth = 0;
            dateTimeFormatterBuilder2.padNextChar = (char) 0;
        }
        this.active.printerParsers.add(dateTimePrinterParser);
        this.active.valueParserIndex = -1;
        return r4.printerParsers.size() - 1;
    }

    private DateTimeFormatterBuilder appendValue(NumberPrinterParser numberPrinterParser) {
        NumberPrinterParser withFixedWidth;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        int i10 = dateTimeFormatterBuilder.valueParserIndex;
        if (i10 >= 0) {
            NumberPrinterParser numberPrinterParser2 = (NumberPrinterParser) dateTimeFormatterBuilder.printerParsers.get(i10);
            if (numberPrinterParser.minWidth == numberPrinterParser.maxWidth && numberPrinterParser.signStyle == SignStyle.NOT_NEGATIVE) {
                withFixedWidth = numberPrinterParser2.withSubsequentWidth(numberPrinterParser.maxWidth);
                appendInternal(numberPrinterParser.withFixedWidth());
                this.active.valueParserIndex = i10;
            } else {
                withFixedWidth = numberPrinterParser2.withFixedWidth();
                this.active.valueParserIndex = appendInternal(numberPrinterParser);
            }
            this.active.printerParsers.set(i10, withFixedWidth);
        } else {
            dateTimeFormatterBuilder.valueParserIndex = appendInternal(numberPrinterParser);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ZoneId lambda$static$0(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zoneId());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r11 == 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseField(char r10, int r11, j$.time.temporal.TemporalField r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.parseField(char, int, j$.time.temporal.TemporalField):void");
    }

    private void parsePattern(String str) {
        WeekBasedFieldPrinterParser weekBasedFieldPrinterParser;
        String str2;
        String str3;
        TextStyle textStyle;
        TextStyle textStyle2;
        int i10;
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i12 = i11 + 1;
                while (i12 < str.length() && str.charAt(i12) == charAt) {
                    i12++;
                }
                int i13 = i12 - i11;
                if (charAt == 'p') {
                    if (i12 >= str.length() || (((charAt = str.charAt(i12)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i10 = i13;
                        i13 = 0;
                    } else {
                        int i14 = i12 + 1;
                        while (i14 < str.length() && str.charAt(i14) == charAt) {
                            i14++;
                        }
                        i10 = i14 - i12;
                        i12 = i14;
                    }
                    if (i13 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                    padNext(i13);
                    i13 = i10;
                }
                TemporalField temporalField = (TemporalField) FIELD_MAP.get(Character.valueOf(charAt));
                if (temporalField != null) {
                    parseField(charAt, i13, temporalField);
                } else if (charAt == 'z') {
                    if (i13 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                    appendZoneText(i13 == 4 ? TextStyle.FULL : TextStyle.SHORT);
                } else if (charAt == 'V') {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                    }
                    appendZoneId();
                } else if (charAt == 'v') {
                    if (i13 == 1) {
                        textStyle2 = TextStyle.SHORT;
                    } else if (i13 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + charAt);
                    } else {
                        textStyle2 = TextStyle.FULL;
                    }
                    appendGenericZoneText(textStyle2);
                } else {
                    String str4 = "+0000";
                    if (charAt == 'Z') {
                        if (i13 < 4) {
                            str2 = "+HHMM";
                            appendOffset(str2, str4);
                        } else {
                            if (i13 != 4) {
                                if (i13 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                }
                                str3 = "+HH:MM:ss";
                                appendOffset(str3, "Z");
                            }
                            textStyle = TextStyle.FULL;
                            appendLocalizedOffset(textStyle);
                        }
                    } else if (charAt == 'O') {
                        if (i13 == 1) {
                            textStyle = TextStyle.SHORT;
                            appendLocalizedOffset(textStyle);
                        } else {
                            if (i13 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                            }
                            textStyle = TextStyle.FULL;
                            appendLocalizedOffset(textStyle);
                        }
                    } else if (charAt == 'X') {
                        if (i13 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        str3 = OffsetIdPrinterParser.PATTERNS[i13 + (i13 == 1 ? 0 : 1)];
                        appendOffset(str3, "Z");
                    } else if (charAt != 'x') {
                        if (charAt == 'W') {
                            if (i13 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            weekBasedFieldPrinterParser = new WeekBasedFieldPrinterParser(charAt, i13, i13, i13);
                        } else if (charAt == 'w') {
                            if (i13 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            weekBasedFieldPrinterParser = new WeekBasedFieldPrinterParser(charAt, i13, i13, 2);
                        } else if (charAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                        } else {
                            weekBasedFieldPrinterParser = i13 == 2 ? new WeekBasedFieldPrinterParser(charAt, i13, i13, 2) : new WeekBasedFieldPrinterParser(charAt, i13, i13, 19);
                        }
                        appendValue(weekBasedFieldPrinterParser);
                    } else if (i13 > 5) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    } else {
                        if (i13 == 1) {
                            str4 = "+00";
                        } else if (i13 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = OffsetIdPrinterParser.PATTERNS[i13 + (i13 == 1 ? 0 : 1)];
                        appendOffset(str2, str4);
                    }
                }
                i11 = i12 - 1;
            } else if (charAt == '\'') {
                int i15 = i11 + 1;
                int i16 = i15;
                while (i16 < str.length()) {
                    if (str.charAt(i16) == '\'') {
                        int i17 = i16 + 1;
                        if (i17 >= str.length() || str.charAt(i17) != '\'') {
                            break;
                        }
                        i16 = i17;
                    }
                    i16++;
                }
                if (i16 >= str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
                String substring = str.substring(i15, i16);
                if (substring.isEmpty()) {
                    appendLiteral('\'');
                } else {
                    appendLiteral(substring.replace("''", "'"));
                }
                i11 = i16;
            } else if (charAt == '[') {
                optionalStart();
            } else if (charAt == ']') {
                if (this.active.parent == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                optionalEnd();
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            } else {
                appendLiteral(charAt);
            }
            i11++;
        }
    }

    private DateTimeFormatter toFormatter(Locale locale, ResolverStyle resolverStyle, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.active.parent != null) {
            optionalEnd();
        }
        return new DateTimeFormatter(new CompositePrinterParser(this.printerParsers, false), locale, DecimalStyle.STANDARD, resolverStyle, null, chronology, null);
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        appendInternal(dateTimeFormatter.toPrinterParser(false));
        return this;
    }

    public DateTimeFormatterBuilder appendFraction(TemporalField temporalField, int i10, int i11, boolean z10) {
        if (i10 != i11 || z10) {
            appendInternal(new FractionPrinterParser(temporalField, i10, i11, z10));
        } else {
            appendValue(new FractionPrinterParser(temporalField, i10, i11, z10));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendGenericZoneText(TextStyle textStyle) {
        appendInternal(new ZoneTextPrinterParser(textStyle, null, true));
        return this;
    }

    public DateTimeFormatterBuilder appendInstant() {
        appendInternal(new InstantPrinterParser(-2));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(char c10) {
        appendInternal(new CharLiteralPrinterParser(c10));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            appendInternal(str.length() == 1 ? new CharLiteralPrinterParser(str.charAt(0)) : new StringLiteralPrinterParser(str));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendLocalizedOffset(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle == TextStyle.FULL || textStyle == TextStyle.SHORT) {
            appendInternal(new LocalizedOffsetIdPrinterParser(textStyle));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        appendInternal(new OffsetIdPrinterParser(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        appendInternal(OffsetIdPrinterParser.INSTANCE_ID_Z);
        return this;
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        Objects.requireNonNull(str, "pattern");
        parsePattern(str);
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        appendInternal(new TextPrinterParser(temporalField, textStyle, DateTimeTextProvider.getInstance()));
        return this;
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, Map map) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        final DateTimeTextProvider.LocaleStore localeStore = new DateTimeTextProvider.LocaleStore(Collections.singletonMap(textStyle, linkedHashMap));
        appendInternal(new TextPrinterParser(temporalField, textStyle, new DateTimeTextProvider() { // from class: j$.time.format.DateTimeFormatterBuilder.1
            @Override // j$.time.format.DateTimeTextProvider
            public String getText(Chronology chronology, TemporalField temporalField2, long j10, TextStyle textStyle2, Locale locale) {
                return localeStore.getText(j10, textStyle2);
            }

            @Override // j$.time.format.DateTimeTextProvider
            public String getText(TemporalField temporalField2, long j10, TextStyle textStyle2, Locale locale) {
                return localeStore.getText(j10, textStyle2);
            }

            @Override // j$.time.format.DateTimeTextProvider
            public Iterator getTextIterator(Chronology chronology, TemporalField temporalField2, TextStyle textStyle2, Locale locale) {
                return localeStore.getTextIterator(textStyle2);
            }

            @Override // j$.time.format.DateTimeTextProvider
            public Iterator getTextIterator(TemporalField temporalField2, TextStyle textStyle2, Locale locale) {
                return localeStore.getTextIterator(textStyle2);
            }
        }));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        appendValue(new NumberPrinterParser(temporalField, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10) {
        Objects.requireNonNull(temporalField, "field");
        if (i10 >= 1 && i10 <= 19) {
            appendValue(new NumberPrinterParser(temporalField, i10, i10, SignStyle.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
        if (i10 == i11 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i11);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        } else if (i11 >= i10) {
            appendValue(new NumberPrinterParser(temporalField, i10, i11, signStyle));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }

    public DateTimeFormatterBuilder appendValueReduced(TemporalField temporalField, int i10, int i11, ChronoLocalDate chronoLocalDate) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(chronoLocalDate, "baseDate");
        appendValue(new ReducedPrinterParser(temporalField, i10, i11, 0, chronoLocalDate));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneId() {
        appendInternal(new ZoneIdPrinterParser(TemporalQueries.zoneId(), "ZoneId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneRegionId() {
        appendInternal(new ZoneIdPrinterParser(QUERY_REGION_ONLY, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle) {
        appendInternal(new ZoneTextPrinterParser(textStyle, null, false));
        return this;
    }

    public DateTimeFormatterBuilder optionalEnd() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        if (dateTimeFormatterBuilder.parent != null) {
            if (dateTimeFormatterBuilder.printerParsers.size() > 0) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.active;
                CompositePrinterParser compositePrinterParser = new CompositePrinterParser(dateTimeFormatterBuilder2.printerParsers, dateTimeFormatterBuilder2.optional);
                this.active = this.active.parent;
                appendInternal(compositePrinterParser);
            } else {
                this.active = this.active.parent;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public DateTimeFormatterBuilder optionalStart() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        dateTimeFormatterBuilder.valueParserIndex = -1;
        this.active = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder padNext(int i10) {
        return padNext(i10, ' ');
    }

    public DateTimeFormatterBuilder padNext(int i10, char c10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("The pad width must be at least one but was " + i10);
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.active;
        dateTimeFormatterBuilder.padNextWidth = i10;
        dateTimeFormatterBuilder.padNextChar = c10;
        dateTimeFormatterBuilder.valueParserIndex = -1;
        return this;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        appendInternal(SettingsParser.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseCaseSensitive() {
        appendInternal(SettingsParser.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseLenient() {
        appendInternal(SettingsParser.LENIENT);
        return this;
    }

    public DateTimeFormatterBuilder parseStrict() {
        appendInternal(SettingsParser.STRICT);
        return this;
    }

    public DateTimeFormatter toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter toFormatter(ResolverStyle resolverStyle, Chronology chronology) {
        return toFormatter(Locale.getDefault(), resolverStyle, chronology);
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        return toFormatter(locale, ResolverStyle.SMART, null);
    }
}
