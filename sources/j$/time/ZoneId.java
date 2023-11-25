package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQueries;
import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import j$.util.Objects;
import j$.util.TimeZoneRetargetClass;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {
    public static final Map SHORT_IDS = ZoneId$$ExternalSyntheticBackport1.m(new Map.Entry[]{ZoneId$$ExternalSyntheticBackport0.m("ACT", "Australia/Darwin"), ZoneId$$ExternalSyntheticBackport0.m("AET", "Australia/Sydney"), ZoneId$$ExternalSyntheticBackport0.m("AGT", "America/Argentina/Buenos_Aires"), ZoneId$$ExternalSyntheticBackport0.m("ART", "Africa/Cairo"), ZoneId$$ExternalSyntheticBackport0.m("AST", "America/Anchorage"), ZoneId$$ExternalSyntheticBackport0.m("BET", "America/Sao_Paulo"), ZoneId$$ExternalSyntheticBackport0.m("BST", "Asia/Dhaka"), ZoneId$$ExternalSyntheticBackport0.m("CAT", "Africa/Harare"), ZoneId$$ExternalSyntheticBackport0.m("CNT", "America/St_Johns"), ZoneId$$ExternalSyntheticBackport0.m("CST", "America/Chicago"), ZoneId$$ExternalSyntheticBackport0.m("CTT", "Asia/Shanghai"), ZoneId$$ExternalSyntheticBackport0.m("EAT", "Africa/Addis_Ababa"), ZoneId$$ExternalSyntheticBackport0.m("ECT", "Europe/Paris"), ZoneId$$ExternalSyntheticBackport0.m("IET", "America/Indiana/Indianapolis"), ZoneId$$ExternalSyntheticBackport0.m("IST", "Asia/Kolkata"), ZoneId$$ExternalSyntheticBackport0.m("JST", "Asia/Tokyo"), ZoneId$$ExternalSyntheticBackport0.m("MIT", "Pacific/Apia"), ZoneId$$ExternalSyntheticBackport0.m("NET", "Asia/Yerevan"), ZoneId$$ExternalSyntheticBackport0.m("NST", "Pacific/Auckland"), ZoneId$$ExternalSyntheticBackport0.m("PLT", "Asia/Karachi"), ZoneId$$ExternalSyntheticBackport0.m("PNT", "America/Phoenix"), ZoneId$$ExternalSyntheticBackport0.m("PRT", "America/Puerto_Rico"), ZoneId$$ExternalSyntheticBackport0.m("PST", "America/Los_Angeles"), ZoneId$$ExternalSyntheticBackport0.m("SST", "Pacific/Guadalcanal"), ZoneId$$ExternalSyntheticBackport0.m("VST", "Asia/Ho_Chi_Minh"), ZoneId$$ExternalSyntheticBackport0.m("EST", "-05:00"), ZoneId$$ExternalSyntheticBackport0.m("MST", "-07:00"), ZoneId$$ExternalSyntheticBackport0.m("HST", "-10:00")});
    private static final long serialVersionUID = 8352817235686L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != ZoneRegion.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId from(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.query(TemporalQueries.zone());
        if (zoneId != null) {
            return zoneId;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static ZoneId of(String str) {
        return of(str, true);
    }

    public static ZoneId of(String str, Map map) {
        Objects.requireNonNull(str, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        return of((String) Objects.requireNonNullElse((String) map.get(str), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId of(String str, boolean z10) {
        int i10;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.of(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i10 = 3;
        } else if (!str.startsWith("UT")) {
            return ZoneRegion.ofId(str, z10);
        } else {
            i10 = 2;
        }
        return ofWithPrefix(str, i10, z10);
    }

    public static ZoneId ofOffset(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.getTotalSeconds() != 0) {
                str = str.concat(zoneOffset.getId());
            }
            return new ZoneRegion(str, zoneOffset.getRules());
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    private static ZoneId ofWithPrefix(String str, int i10, boolean z10) {
        String substring = str.substring(0, i10);
        if (str.length() == i10) {
            return ofOffset(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
            try {
                ZoneOffset of = ZoneOffset.of(str.substring(i10));
                return of == ZoneOffset.UTC ? ofOffset(substring, of) : ofOffset(substring, of);
            } catch (DateTimeException e10) {
                throw new DateTimeException("Invalid ID for offset-based ZoneId: " + str, e10);
            }
        }
        return ZoneRegion.ofId(str, z10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        return TimeZoneRetargetClass.toZoneId(TimeZone.getDefault());
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public abstract ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.getOffset(Instant.EPOCH);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public String toString() {
        return getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void write(DataOutput dataOutput);
}
