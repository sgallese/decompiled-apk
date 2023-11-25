package com.habitrpg.android.habitica.models.tasks;

import android.os.Parcel;
import android.os.Parcelable;
import com.habitrpg.android.habitica.extensions.b;
import com.habitrpg.android.habitica.extensions.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.m5;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.TemporalAccessor;
import java.util.UUID;
import qc.h;
import qc.q;

/* compiled from: RemindersItem.kt */
/* loaded from: classes4.dex */
public class RemindersItem extends d1 implements Parcelable, m5 {

    /* renamed from: id  reason: collision with root package name */
    private String f12529id;
    private String startDate;
    private String time;
    private String type;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* compiled from: RemindersItem.kt */
    /* loaded from: classes4.dex */
    public static final class CREATOR implements Parcelable.Creator<RemindersItem> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(h hVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemindersItem createFromParcel(Parcel parcel) {
            q.i(parcel, "source");
            return new RemindersItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemindersItem[] newArray(int i10) {
            return new RemindersItem[i10];
        }
    }

    public RemindersItem(Parcel parcel) {
        q.i(parcel, "source");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id(parcel.readString());
        realmSet$startDate(parcel.readString());
        realmSet$time(parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RemindersItem) {
            return q.d(realmGet$id(), ((RemindersItem) obj).realmGet$id());
        }
        return super.equals(obj);
    }

    public final String getId() {
        return realmGet$id();
    }

    public final Instant getLocalZonedDateTimeInstant() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE).appendPattern("['T'][' ']").append(DateTimeFormatter.ISO_LOCAL_TIME).appendPattern("[XX]").toFormatter();
        q.h(formatter, "toFormatter(...)");
        TemporalAccessor parseBest = formatter.parseBest(realmGet$time(), new b(), new c());
        q.h(parseBest, "parseBest(...)");
        if (parseBest instanceof ZonedDateTime) {
            ZonedDateTime withZoneSameLocal = ((ZonedDateTime) parseBest).withZoneSameLocal(ZoneId.systemDefault());
            if (withZoneSameLocal == null) {
                return null;
            }
            return withZoneSameLocal.toInstant();
        }
        ZoneId of = ZoneId.of("UTC");
        q.h(of, "of(...)");
        ZonedDateTime withZoneSameLocal2 = ((LocalDateTime) parseBest).atZone(of).withZoneSameLocal(ZoneId.systemDefault());
        if (withZoneSameLocal2 == null) {
            return null;
        }
        return withZoneSameLocal2.toInstant();
    }

    public final String getStartDate() {
        return realmGet$startDate();
    }

    public final String getTime() {
        return realmGet$time();
    }

    public final String getType() {
        return realmGet$type();
    }

    public final ZonedDateTime getZonedDateTime() {
        if (realmGet$time() == null) {
            return null;
        }
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE).appendPattern("['T'][' ']").append(DateTimeFormatter.ISO_LOCAL_TIME).appendPattern("[XX]").toFormatter();
        q.h(formatter, "toFormatter(...)");
        TemporalAccessor parseBest = formatter.parseBest(realmGet$time(), new b(), new c());
        q.h(parseBest, "parseBest(...)");
        if (parseBest instanceof ZonedDateTime) {
            return (ZonedDateTime) parseBest;
        }
        ZoneId of = ZoneId.of("UTC");
        q.h(of, "of(...)");
        return ((LocalDateTime) parseBest).atZone(of);
    }

    public int hashCode() {
        String realmGet$id = realmGet$id();
        if (realmGet$id != null) {
            return realmGet$id.hashCode();
        }
        return 0;
    }

    @Override // io.realm.m5
    public String realmGet$id() {
        return this.f12529id;
    }

    @Override // io.realm.m5
    public String realmGet$startDate() {
        return this.startDate;
    }

    @Override // io.realm.m5
    public String realmGet$time() {
        return this.time;
    }

    @Override // io.realm.m5
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.m5
    public void realmSet$id(String str) {
        this.f12529id = str;
    }

    @Override // io.realm.m5
    public void realmSet$startDate(String str) {
        this.startDate = str;
    }

    @Override // io.realm.m5
    public void realmSet$time(String str) {
        this.time = str;
    }

    @Override // io.realm.m5
    public void realmSet$type(String str) {
        this.type = str;
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final void setStartDate(String str) {
        realmSet$startDate(str);
    }

    public final void setTime(String str) {
        realmSet$time(str);
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "dest");
        parcel.writeString(realmGet$id());
        parcel.writeString(realmGet$startDate());
        parcel.writeString(realmGet$time());
    }

    public RemindersItem() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id(UUID.randomUUID().toString());
    }
}
