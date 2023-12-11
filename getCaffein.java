getCaffein(type){
    String caffein;

    // const map = {
    //     'Coffee': '95 mg',
    //     'Redbull': '147 mg',
    //     'Tea': '11 mg',
    //     'Soda': '21 mg'
    // };


    switch(type){
        case 'Coffee':
            caffein = '95 mg';
            break;
        case 'Redbull':
            caffein = '147 mg';
            break;
        case 'Tea':
            caffein = '11 mg';
            break;
        case 'Soda':
            caffein = '21 mg';
            break;
         default:
          caffein = 'Not found';
    }
    return caffein;

}

print(getCaffein('Redbul'))