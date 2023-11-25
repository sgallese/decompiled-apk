package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import okio.r0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: NioSystemFileSystem.kt */
@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class k0 extends s {
    private final Long u(FileTime fileTime) {
        long millis;
        boolean z10;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        return valueOf;
    }

    @Override // okio.s, okio.j
    public void c(r0 r0Var, r0 r0Var2) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        qc.q.i(r0Var, "source");
        qc.q.i(r0Var2, "target");
        try {
            Path q10 = r0Var.q();
            Path q11 = r0Var2.q();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(q10, q11, b0.a(standardCopyOption), b0.a(standardCopyOption2));
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            message = e10.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // okio.s, okio.j
    public i m(r0 r0Var) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        Path path;
        boolean isRegularFile;
        boolean isDirectory;
        r0 r0Var2;
        long size;
        FileTime creationTime;
        Long l10;
        FileTime lastModifiedTime;
        Long l11;
        FileTime lastAccessTime;
        qc.q.i(r0Var, "path");
        Path q10 = r0Var.q();
        Long l12 = null;
        try {
            Class a10 = f0.a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(q10, a10, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            if (isSymbolicLink) {
                path = Files.readSymbolicLink(q10);
            } else {
                path = null;
            }
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            if (path != null) {
                r0Var2 = r0.a.f(r0.f20670m, path, false, 1, null);
            } else {
                r0Var2 = null;
            }
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l10 = u(creationTime);
            } else {
                l10 = null;
            }
            lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l11 = u(lastModifiedTime);
            } else {
                l11 = null;
            }
            lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l12 = u(lastAccessTime);
            }
            return new i(isRegularFile, isDirectory, r0Var2, valueOf, l10, l11, l12, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.s
    public String toString() {
        return "NioSystemFileSystem";
    }
}
