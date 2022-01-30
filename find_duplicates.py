import os
from typing import Set


def get_files_in(dir: str) -> Set[str]:
    return {
        d + '/' + f.replace(os.sep, '/')
        for (d, ds, fs) in os.walk(dir)
        for f in fs}

arrayv_files = get_files_in('ArrayV/src/sorts')
pack_files = get_files_in('src/sorts')

for duplicate in (arrayv_files & pack_files):
    print(duplicate)
