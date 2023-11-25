package j$.util;

import j$.time.ZoneId;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class TimeZoneRetargetClass {
    public static /* synthetic */ ZoneId toZoneId(TimeZone timeZone) {
        return DesugarTimeZone.toZoneId(timeZone);
    }
}
