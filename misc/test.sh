#!/bin/bash
cert_count=`/opt/puppetlabs/bin/puppet cert list | wc -l`
echo $cert_count
if [[ $crt_count == '0' ]]
then
    echo "All certs are already signed"
    exit 0
else    
    /opt/puppetlabs/bin/puppet cert sign --all
    echo "Inside else"
    exit 0
fi
