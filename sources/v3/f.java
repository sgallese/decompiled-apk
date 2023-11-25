package v3;

import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f24538a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f24539b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f24540c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f24541d;

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f24542a;

        /* renamed from: b  reason: collision with root package name */
        public final String f24543b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24544c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f24545d;

        /* renamed from: e  reason: collision with root package name */
        public final int f24546e;

        /* renamed from: f  reason: collision with root package name */
        public final String f24547f;

        /* renamed from: g  reason: collision with root package name */
        private final int f24548g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f24542a = str;
            this.f24543b = str2;
            this.f24545d = z10;
            this.f24546e = i10;
            this.f24544c = a(str2);
            this.f24547f = str3;
            this.f24548g = i11;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                if (upperCase.contains("BLOB")) {
                    return 5;
                }
                if (!upperCase.contains("REAL") && !upperCase.contains("FLOA") && !upperCase.contains("DOUB")) {
                    return 1;
                }
                return 4;
            }
            return 2;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24546e != aVar.f24546e || !this.f24542a.equals(aVar.f24542a) || this.f24545d != aVar.f24545d) {
                return false;
            }
            if (this.f24548g == 1 && aVar.f24548g == 2 && (str3 = this.f24547f) != null && !str3.equals(aVar.f24547f)) {
                return false;
            }
            if (this.f24548g == 2 && aVar.f24548g == 1 && (str2 = aVar.f24547f) != null && !str2.equals(this.f24547f)) {
                return false;
            }
            int i10 = this.f24548g;
            if ((i10 == 0 || i10 != aVar.f24548g || ((str = this.f24547f) == null ? aVar.f24547f == null : str.equals(aVar.f24547f))) && this.f24544c == aVar.f24544c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = ((this.f24542a.hashCode() * 31) + this.f24544c) * 31;
            if (this.f24545d) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return ((hashCode + i10) * 31) + this.f24546e;
        }

        public String toString() {
            return "Column{name='" + this.f24542a + "', type='" + this.f24543b + "', affinity='" + this.f24544c + "', notNull=" + this.f24545d + ", primaryKeyPosition=" + this.f24546e + ", defaultValue='" + this.f24547f + "'}";
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f24549a;

        /* renamed from: b  reason: collision with root package name */
        public final String f24550b;

        /* renamed from: c  reason: collision with root package name */
        public final String f24551c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f24552d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f24553e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f24549a = str;
            this.f24550b = str2;
            this.f24551c = str3;
            this.f24552d = Collections.unmodifiableList(list);
            this.f24553e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f24549a.equals(bVar.f24549a) || !this.f24550b.equals(bVar.f24550b) || !this.f24551c.equals(bVar.f24551c) || !this.f24552d.equals(bVar.f24552d)) {
                return false;
            }
            return this.f24553e.equals(bVar.f24553e);
        }

        public int hashCode() {
            return (((((((this.f24549a.hashCode() * 31) + this.f24550b.hashCode()) * 31) + this.f24551c.hashCode()) * 31) + this.f24552d.hashCode()) * 31) + this.f24553e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f24549a + "', onDelete='" + this.f24550b + "', onUpdate='" + this.f24551c + "', columnNames=" + this.f24552d + ", referenceColumnNames=" + this.f24553e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: f  reason: collision with root package name */
        final int f24554f;

        /* renamed from: m  reason: collision with root package name */
        final int f24555m;

        /* renamed from: p  reason: collision with root package name */
        final String f24556p;

        /* renamed from: q  reason: collision with root package name */
        final String f24557q;

        c(int i10, int i11, String str, String str2) {
            this.f24554f = i10;
            this.f24555m = i11;
            this.f24556p = str;
            this.f24557q = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10 = this.f24554f - cVar.f24554f;
            if (i10 == 0) {
                return this.f24555m - cVar.f24555m;
            }
            return i10;
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f24558a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24559b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f24560c;

        public d(String str, boolean z10, List<String> list) {
            this.f24558a = str;
            this.f24559b = z10;
            this.f24560c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f24559b != dVar.f24559b || !this.f24560c.equals(dVar.f24560c)) {
                return false;
            }
            if (this.f24558a.startsWith("index_")) {
                return dVar.f24558a.startsWith("index_");
            }
            return this.f24558a.equals(dVar.f24558a);
        }

        public int hashCode() {
            int hashCode;
            if (this.f24558a.startsWith("index_")) {
                hashCode = -1184239155;
            } else {
                hashCode = this.f24558a.hashCode();
            }
            return (((hashCode * 31) + (this.f24559b ? 1 : 0)) * 31) + this.f24560c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f24558a + "', unique=" + this.f24559b + ", columns=" + this.f24560c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> unmodifiableSet;
        this.f24538a = str;
        this.f24539b = Collections.unmodifiableMap(map);
        this.f24540c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set2);
        }
        this.f24541d = unmodifiableSet;
    }

    public static f a(x3.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(x3.b bVar, String str) {
        boolean z10;
        Cursor Z = bVar.Z("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (Z.getColumnCount() > 0) {
                int columnIndex = Z.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex2 = Z.getColumnIndex(TaskFormActivity.TASK_TYPE_KEY);
                int columnIndex3 = Z.getColumnIndex("notnull");
                int columnIndex4 = Z.getColumnIndex("pk");
                int columnIndex5 = Z.getColumnIndex("dflt_value");
                while (Z.moveToNext()) {
                    String string = Z.getString(columnIndex);
                    String string2 = Z.getString(columnIndex2);
                    if (Z.getInt(columnIndex3) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hashMap.put(string, new a(string, string2, z10, Z.getInt(columnIndex4), Z.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            Z.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(x3.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor Z = bVar.Z("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = Z.getColumnIndex("id");
            int columnIndex2 = Z.getColumnIndex("seq");
            int columnIndex3 = Z.getColumnIndex("table");
            int columnIndex4 = Z.getColumnIndex("on_delete");
            int columnIndex5 = Z.getColumnIndex("on_update");
            List<c> c10 = c(Z);
            int count = Z.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                Z.moveToPosition(i10);
                if (Z.getInt(columnIndex2) == 0) {
                    int i11 = Z.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c10) {
                        if (cVar.f24554f == i11) {
                            arrayList.add(cVar.f24556p);
                            arrayList2.add(cVar.f24557q);
                        }
                    }
                    hashSet.add(new b(Z.getString(columnIndex3), Z.getString(columnIndex4), Z.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            Z.close();
        }
    }

    private static d e(x3.b bVar, String str, boolean z10) {
        Cursor Z = bVar.Z("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = Z.getColumnIndex("seqno");
            int columnIndex2 = Z.getColumnIndex("cid");
            int columnIndex3 = Z.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (Z.moveToNext()) {
                    if (Z.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(Z.getInt(columnIndex)), Z.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z10, arrayList);
            }
            Z.close();
            return null;
        } finally {
            Z.close();
        }
    }

    private static Set<d> f(x3.b bVar, String str) {
        Cursor Z = bVar.Z("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = Z.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex2 = Z.getColumnIndex("origin");
            int columnIndex3 = Z.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (Z.moveToNext()) {
                    if ("c".equals(Z.getString(columnIndex2))) {
                        String string = Z.getString(columnIndex);
                        boolean z10 = true;
                        if (Z.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d e10 = e(bVar, string, z10);
                        if (e10 == null) {
                            return null;
                        }
                        hashSet.add(e10);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            Z.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f24538a;
        if (str == null ? fVar.f24538a != null : !str.equals(fVar.f24538a)) {
            return false;
        }
        Map<String, a> map = this.f24539b;
        if (map == null ? fVar.f24539b != null : !map.equals(fVar.f24539b)) {
            return false;
        }
        Set<b> set2 = this.f24540c;
        if (set2 == null ? fVar.f24540c != null : !set2.equals(fVar.f24540c)) {
            return false;
        }
        Set<d> set3 = this.f24541d;
        if (set3 == null || (set = fVar.f24541d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f24538a;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Map<String, a> map = this.f24539b;
        if (map != null) {
            i11 = map.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Set<b> set = this.f24540c;
        if (set != null) {
            i12 = set.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        return "TableInfo{name='" + this.f24538a + "', columns=" + this.f24539b + ", foreignKeys=" + this.f24540c + ", indices=" + this.f24541d + '}';
    }
}
