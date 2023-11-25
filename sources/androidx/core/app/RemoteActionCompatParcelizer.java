package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3617a = (IconCompat) versionedParcel.v(remoteActionCompat.f3617a, 1);
        remoteActionCompat.f3618b = versionedParcel.l(remoteActionCompat.f3618b, 2);
        remoteActionCompat.f3619c = versionedParcel.l(remoteActionCompat.f3619c, 3);
        remoteActionCompat.f3620d = (PendingIntent) versionedParcel.r(remoteActionCompat.f3620d, 4);
        remoteActionCompat.f3621e = versionedParcel.h(remoteActionCompat.f3621e, 5);
        remoteActionCompat.f3622f = versionedParcel.h(remoteActionCompat.f3622f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f3617a, 1);
        versionedParcel.D(remoteActionCompat.f3618b, 2);
        versionedParcel.D(remoteActionCompat.f3619c, 3);
        versionedParcel.H(remoteActionCompat.f3620d, 4);
        versionedParcel.z(remoteActionCompat.f3621e, 5);
        versionedParcel.z(remoteActionCompat.f3622f, 6);
    }
}
