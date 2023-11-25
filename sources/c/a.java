package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: e  reason: collision with root package name */
    public static final String f8153e = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0190a extends Binder implements a {

        /* compiled from: INotificationSideChannel.java */
        /* renamed from: c.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0191a implements a {

            /* renamed from: f  reason: collision with root package name */
            private IBinder f8154f;

            C0191a(IBinder iBinder) {
                this.f8154f = iBinder;
            }

            @Override // c.a
            public void D(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f8153e);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f8154f.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8154f;
            }
        }

        public static a J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f8153e);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0191a(iBinder);
        }
    }

    /* compiled from: INotificationSideChannel.java */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void D(String str, int i10, String str2, Notification notification) throws RemoteException;
}
